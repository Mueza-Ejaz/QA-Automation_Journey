/*
   Licensed to the Apache Software Foundation (ASF) under one or more
   contributor license agreements.  See the NOTICE file distributed with
   this work for additional information regarding copyright ownership.
   The ASF licenses this file to You under the Apache License, Version 2.0
   (the "License"); you may not use this file except in compliance with
   the License.  You may obtain a copy of the License at

       http://www.apache.org/licenses/LICENSE-2.0

   Unless required by applicable law or agreed to in writing, software
   distributed under the License is distributed on an "AS IS" BASIS,
   WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
   See the License for the specific language governing permissions and
   limitations under the License.
*/
var showControllersOnly = false;
var seriesFilter = "";
var filtersOnlySampleSeries = true;

/*
 * Add header in statistics table to group metrics by category
 * format
 *
 */
function summaryTableHeader(header) {
    var newRow = header.insertRow(-1);
    newRow.className = "tablesorter-no-sort";
    var cell = document.createElement('th');
    cell.setAttribute("data-sorter", false);
    cell.colSpan = 1;
    cell.innerHTML = "Requests";
    newRow.appendChild(cell);

    cell = document.createElement('th');
    cell.setAttribute("data-sorter", false);
    cell.colSpan = 3;
    cell.innerHTML = "Executions";
    newRow.appendChild(cell);

    cell = document.createElement('th');
    cell.setAttribute("data-sorter", false);
    cell.colSpan = 7;
    cell.innerHTML = "Response Times (ms)";
    newRow.appendChild(cell);

    cell = document.createElement('th');
    cell.setAttribute("data-sorter", false);
    cell.colSpan = 1;
    cell.innerHTML = "Throughput";
    newRow.appendChild(cell);

    cell = document.createElement('th');
    cell.setAttribute("data-sorter", false);
    cell.colSpan = 2;
    cell.innerHTML = "Network (KB/sec)";
    newRow.appendChild(cell);
}

/*
 * Populates the table identified by id parameter with the specified data and
 * format
 *
 */
function createTable(table, info, formatter, defaultSorts, seriesIndex, headerCreator) {
    var tableRef = table[0];

    // Create header and populate it with data.titles array
    var header = tableRef.createTHead();

    // Call callback is available
    if(headerCreator) {
        headerCreator(header);
    }

    var newRow = header.insertRow(-1);
    for (var index = 0; index < info.titles.length; index++) {
        var cell = document.createElement('th');
        cell.innerHTML = info.titles[index];
        newRow.appendChild(cell);
    }

    var tBody;

    // Create overall body if defined
    if(info.overall){
        tBody = document.createElement('tbody');
        tBody.className = "tablesorter-no-sort";
        tableRef.appendChild(tBody);
        var newRow = tBody.insertRow(-1);
        var data = info.overall.data;
        for(var index=0;index < data.length; index++){
            var cell = newRow.insertCell(-1);
            cell.innerHTML = formatter ? formatter(index, data[index]): data[index];
        }
    }

    // Create regular body
    tBody = document.createElement('tbody');
    tableRef.appendChild(tBody);

    var regexp;
    if(seriesFilter) {
        regexp = new RegExp(seriesFilter, 'i');
    }
    // Populate body with data.items array
    for(var index=0; index < info.items.length; index++){
        var item = info.items[index];
        if((!regexp || filtersOnlySampleSeries && !info.supportsControllersDiscrimination || regexp.test(item.data[seriesIndex]))
                &&
                (!showControllersOnly || !info.supportsControllersDiscrimination || item.isController)){
            if(item.data.length > 0) {
                var newRow = tBody.insertRow(-1);
                for(var col=0; col < item.data.length; col++){
                    var cell = newRow.insertCell(-1);
                    cell.innerHTML = formatter ? formatter(col, item.data[col]) : item.data[col];
                }
            }
        }
    }

    // Add support of columns sort
    table.tablesorter({sortList : defaultSorts});
}

$(document).ready(function() {

    // Customize table sorter default options
    $.extend( $.tablesorter.defaults, {
        theme: 'blue',
        cssInfoBlock: "tablesorter-no-sort",
        widthFixed: true,
        widgets: ['zebra']
    });

    var data = {"OkPercent": 26.666666666666668, "KoPercent": 73.33333333333333};
    var dataset = [
        {
            "label" : "FAIL",
            "data" : data.KoPercent,
            "color" : "#FF6347"
        },
        {
            "label" : "PASS",
            "data" : data.OkPercent,
            "color" : "#9ACD32"
        }];
    $.plot($("#flot-requests-summary"), dataset, {
        series : {
            pie : {
                show : true,
                radius : 1,
                label : {
                    show : true,
                    radius : 3 / 4,
                    formatter : function(label, series) {
                        return '<div style="font-size:8pt;text-align:center;padding:2px;color:white;">'
                            + label
                            + '<br/>'
                            + Math.round10(series.percent, -2)
                            + '%</div>';
                    },
                    background : {
                        opacity : 0.5,
                        color : '#000'
                    }
                }
            }
        },
        legend : {
            show : true
        }
    });

    // Creates APDEX table
    createTable($("#apdexTable"), {"supportsControllersDiscrimination": true, "overall": {"data": [0.06666666666666667, 500, 1500, "Total"], "isController": false}, "titles": ["Apdex", "T (Toleration threshold)", "F (Frustration threshold)", "Label"], "items": [{"data": [0.0, 500, 1500, "DealsPage"], "isController": false}, {"data": [0.2, 500, 1500, "CardsPage"], "isController": false}, {"data": [0.0, 500, 1500, "RegisterPage"], "isController": false}]}, function(index, item){
        switch(index){
            case 0:
                item = item.toFixed(3);
                break;
            case 1:
            case 2:
                item = formatDuration(item);
                break;
        }
        return item;
    }, [[0, 0]], 3);

    // Create statistics table
    createTable($("#statisticsTable"), {"supportsControllersDiscrimination": true, "overall": {"data": ["Total", 45, 33, 73.33333333333333, 1769.0888888888885, 45, 5717, 1554.0, 4797.199999999999, 5567.899999999999, 5717.0, 4.258137774413323, 548.5808425198713, 1.8706975066237699], "isController": false}, "titles": ["Label", "#Samples", "FAIL", "Error %", "Average", "Min", "Max", "Median", "90th pct", "95th pct", "99th pct", "Transactions/s", "Received", "Sent"], "items": [{"data": ["DealsPage", 15, 15, 100.0, 93.13333333333333, 45, 227, 76.0, 204.20000000000002, 227.0, 227.0, 3.451449608835711, 6.47798442533364, 1.7688679245283019], "isController": false}, {"data": ["CardsPage", 15, 5, 33.333333333333336, 1754.4, 805, 3832, 1883.0, 3092.2000000000003, 3832.0, 3832.0, 2.909796314258002, 524.5779279825412, 1.8919359238603297], "isController": false}, {"data": ["RegisterPage", 15, 13, 86.66666666666667, 3459.7333333333327, 1530, 5717, 3018.0, 5695.4, 5717.0, 5717.0, 1.5812776723592663, 323.1129880547649, 0.245530419829222], "isController": false}]}, function(index, item){
        switch(index){
            // Errors pct
            case 3:
                item = item.toFixed(2) + '%';
                break;
            // Mean
            case 4:
            // Mean
            case 7:
            // Median
            case 8:
            // Percentile 1
            case 9:
            // Percentile 2
            case 10:
            // Percentile 3
            case 11:
            // Throughput
            case 12:
            // Kbytes/s
            case 13:
            // Sent Kbytes/s
                item = item.toFixed(2);
                break;
        }
        return item;
    }, [[0, 0]], 0, summaryTableHeader);

    // Create error table
    createTable($("#errorsTable"), {"supportsControllersDiscrimination": false, "titles": ["Type of error", "Number of errors", "% in errors", "% in all samples"], "items": [{"data": ["The operation lasted too long: It took 2,294 milliseconds, but should not have lasted longer than 2,000 milliseconds.", 1, 3.0303030303030303, 2.2222222222222223], "isController": false}, {"data": ["The operation lasted too long: It took 5,171 milliseconds, but should not have lasted longer than 2,000 milliseconds.", 1, 3.0303030303030303, 2.2222222222222223], "isController": false}, {"data": ["The operation lasted too long: It took 3,350 milliseconds, but should not have lasted longer than 2,000 milliseconds.", 1, 3.0303030303030303, 2.2222222222222223], "isController": false}, {"data": ["The operation lasted too long: It took 2,599 milliseconds, but should not have lasted longer than 2,000 milliseconds.", 1, 3.0303030303030303, 2.2222222222222223], "isController": false}, {"data": ["The operation lasted too long: It took 3,832 milliseconds, but should not have lasted longer than 2,000 milliseconds.", 1, 3.0303030303030303, 2.2222222222222223], "isController": false}, {"data": ["403/Forbidden", 15, 45.45454545454545, 33.333333333333336], "isController": false}, {"data": ["The operation lasted too long: It took 2,086 milliseconds, but should not have lasted longer than 2,000 milliseconds.", 1, 3.0303030303030303, 2.2222222222222223], "isController": false}, {"data": ["The operation lasted too long: It took 2,250 milliseconds, but should not have lasted longer than 2,000 milliseconds.", 1, 3.0303030303030303, 2.2222222222222223], "isController": false}, {"data": ["The operation lasted too long: It took 5,717 milliseconds, but should not have lasted longer than 2,000 milliseconds.", 1, 3.0303030303030303, 2.2222222222222223], "isController": false}, {"data": ["The operation lasted too long: It took 2,218 milliseconds, but should not have lasted longer than 2,000 milliseconds.", 1, 3.0303030303030303, 2.2222222222222223], "isController": false}, {"data": ["The operation lasted too long: It took 2,693 milliseconds, but should not have lasted longer than 2,000 milliseconds.", 1, 3.0303030303030303, 2.2222222222222223], "isController": false}, {"data": ["The operation lasted too long: It took 4,020 milliseconds, but should not have lasted longer than 2,000 milliseconds.", 1, 3.0303030303030303, 2.2222222222222223], "isController": false}, {"data": ["The operation lasted too long: It took 3,018 milliseconds, but should not have lasted longer than 2,000 milliseconds.", 1, 3.0303030303030303, 2.2222222222222223], "isController": false}, {"data": ["The operation lasted too long: It took 5,304 milliseconds, but should not have lasted longer than 2,000 milliseconds.", 1, 3.0303030303030303, 2.2222222222222223], "isController": false}, {"data": ["The operation lasted too long: It took 2,917 milliseconds, but should not have lasted longer than 2,000 milliseconds.", 1, 3.0303030303030303, 2.2222222222222223], "isController": false}, {"data": ["The operation lasted too long: It took 5,681 milliseconds, but should not have lasted longer than 2,000 milliseconds.", 1, 3.0303030303030303, 2.2222222222222223], "isController": false}, {"data": ["The operation lasted too long: It took 4,548 milliseconds, but should not have lasted longer than 2,000 milliseconds.", 1, 3.0303030303030303, 2.2222222222222223], "isController": false}, {"data": ["The operation lasted too long: It took 2,092 milliseconds, but should not have lasted longer than 2,000 milliseconds.", 1, 3.0303030303030303, 2.2222222222222223], "isController": false}, {"data": ["The operation lasted too long: It took 2,069 milliseconds, but should not have lasted longer than 2,000 milliseconds.", 1, 3.0303030303030303, 2.2222222222222223], "isController": false}]}, function(index, item){
        switch(index){
            case 2:
            case 3:
                item = item.toFixed(2) + '%';
                break;
        }
        return item;
    }, [[1, 1]]);

        // Create top5 errors by sampler
    createTable($("#top5ErrorsBySamplerTable"), {"supportsControllersDiscrimination": false, "overall": {"data": ["Total", 45, 33, "403/Forbidden", 15, "The operation lasted too long: It took 2,294 milliseconds, but should not have lasted longer than 2,000 milliseconds.", 1, "The operation lasted too long: It took 5,171 milliseconds, but should not have lasted longer than 2,000 milliseconds.", 1, "The operation lasted too long: It took 3,350 milliseconds, but should not have lasted longer than 2,000 milliseconds.", 1, "The operation lasted too long: It took 2,599 milliseconds, but should not have lasted longer than 2,000 milliseconds.", 1], "isController": false}, "titles": ["Sample", "#Samples", "#Errors", "Error", "#Errors", "Error", "#Errors", "Error", "#Errors", "Error", "#Errors", "Error", "#Errors"], "items": [{"data": ["DealsPage", 15, 15, "403/Forbidden", 15, "", "", "", "", "", "", "", ""], "isController": false}, {"data": ["CardsPage", 15, 5, "The operation lasted too long: It took 2,294 milliseconds, but should not have lasted longer than 2,000 milliseconds.", 1, "The operation lasted too long: It took 2,599 milliseconds, but should not have lasted longer than 2,000 milliseconds.", 1, "The operation lasted too long: It took 3,832 milliseconds, but should not have lasted longer than 2,000 milliseconds.", 1, "The operation lasted too long: It took 2,250 milliseconds, but should not have lasted longer than 2,000 milliseconds.", 1, "The operation lasted too long: It took 2,218 milliseconds, but should not have lasted longer than 2,000 milliseconds.", 1], "isController": false}, {"data": ["RegisterPage", 15, 13, "The operation lasted too long: It took 5,171 milliseconds, but should not have lasted longer than 2,000 milliseconds.", 1, "The operation lasted too long: It took 3,350 milliseconds, but should not have lasted longer than 2,000 milliseconds.", 1, "The operation lasted too long: It took 2,086 milliseconds, but should not have lasted longer than 2,000 milliseconds.", 1, "The operation lasted too long: It took 5,717 milliseconds, but should not have lasted longer than 2,000 milliseconds.", 1, "The operation lasted too long: It took 2,693 milliseconds, but should not have lasted longer than 2,000 milliseconds.", 1], "isController": false}]}, function(index, item){
        return item;
    }, [[0, 0]], 0);

});
