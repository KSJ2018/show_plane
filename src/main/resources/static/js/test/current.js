var result = {};
var level = 0;


ref = setInterval(function () {
    $(function () {
        $(".main-menu").empty();
        $.ajax({
            url: "http://192.168.0.100:8001/getResource",
            type: "get",//请求方式
            async: false,
            success: function (data) {   //如何发送成功   data是服务器返回的数据

                // for (var i = 0; i < data.length; i++) {
                //     var result = data[i];
                //     var j = i;
                //     if (result["parent_id"] == "0")
                //         $(".main-menu").append("<li><a th:href=\"index.html\"><i class=\"icon-bar-chart\"></i><span class=\"factory-play\"> "+result["description"]+"</span></a></li>");
                // }
                result = {};
                findParentId(data, [0]);


            },
            error: function (XMLHttpRequest, textStatus, errorThrown) {
                console.log(XMLHttpRequest.status);
                console.log(XMLHttpRequest.readyState);
                console.log(textStatus);
            }
        });
    });
}, 1000 * 1);


function findParentId(data, parentIds) {
    var parentId = [];

    $.each(data, function (indexOrkey, val) {
        var pid = val["parent_id"];
        $.each(parentIds, function (iok, value) {

            if (parseInt(pid) === parseInt(value)) {


                if (result["" + value] === null || result["" + value] === undefined) {
                    result["" + value] = [];
                }
                result["" + value].push(val);
                parentId.push(parseInt(val.id));
            }
        })
    });

    if (parentId.length > 0)
        findParentId(data, parentId);
    else
        console.log(JSON.stringify(result));
}