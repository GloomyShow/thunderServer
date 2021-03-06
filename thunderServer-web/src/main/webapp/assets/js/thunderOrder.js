

/**
 * 页面渲染结束后自动执行的类
 */
$(document).ready(function() {
    $.thunderOrderUtils.init();
});


/**
 * 所有其他类型的方法
 * @type {{init: $.thunderOrderUtils.init, queryList: $.thunderOrderUtils.queryList}}
 */
$.thunderOrderUtils={
		init:function(){
            $.thunderOrderUtils.queryList();
            $.thunderOrderUtils.initValid();
		},
		queryList:function(){

            $('#thunderOrderTable').bootstrapTable('refreshOptions',{
                url: getContextPath() + "/thunderOrder/selectByExample",
                queryParams:function(params){
                    return{
                        offset: params.offset,
                        pageSize: params.limit
                        //对象查询相关可以从此处传递值,具体实现需自行编码
                        //例如: id:id

                    }
                },
                responseHandler: function (response) {
                    return response;
                }
            });
        },
        initValid:function(){

            $('#addThunderOrderForm').validate({
                rules:{


                            customerId : "required",

                            courierId : "required",












                            expectedArrivalTime : "required",


                            startedTime : "required",

                            finshedTime : "required",

                            createdTime : "required",

                            updateTime : "required",

                },
                messages:{
                        customerId : "请输入!",
                        courierId : "请输入!",
                        expectedArrivalTime : "请输入!",
                        startedTime : "请输入!",
                        finshedTime : "请输入!",
                        createdTime : "请输入!",
                        updateTime : "请输入!",

                },
                errorClass: "text-danger",
                errorElement: "span",
                highlight:function(element, errorClass, validClass) {
                $(element).parent().addClass('has-error');
                },
                unhighlight: function(element, errorClass, validClass) {
                $(element).parent().removeClass('has-error');
                }

            });



            $('#updateThunderOrderForm').validate({
            rules:{

                    customerId : "required",

                    courierId : "required",












                    expectedArrivalTime : "required",


                    startedTime : "required",

                    finshedTime : "required",

                    createdTime : "required",

                    updateTime : "required",

            },
            messages:{
                    customerId : "请输入!",
                    courierId : "请输入!",
                    expectedArrivalTime : "请输入!",
                    startedTime : "请输入!",
                    finshedTime : "请输入!",
                    createdTime : "请输入!",
                    updateTime : "请输入!",

            },
            errorClass: "text-danger",
            errorElement: "span",
            highlight:function(element, errorClass, validClass) {
            $(element).parent().addClass('has-error');
            },
            unhighlight: function(element, errorClass, validClass) {
            $(element).parent().removeClass('has-error');
            }

            });




        }
};

/**
 * 所有非后台交互的按钮产生的动作方法
 * @type {{deleteById: $.thunderOrderUtils.button.deleteById, updateById: $.thunderOrderUtils.button.updateById, deleteBatch: $.thunderOrderUtils.button.deleteBatch}}
 */
$.thunderOrderUtils.button={
    add:function(){

        $('#addThunderOrderForm div').removeClass('has-error');

        $('#addThunderOrderForm').validate().resetForm();

        $('#addThunderOrderForm')[0].reset();

        $('#addThunderOrderDialog').modal('show');
    },
    deleteByPrimaryKey:function(
            id
    ){

        $("#idForDel").val(id);

        $('#deleteThunderOrderDialog').modal('show');

    },
    updateById:function(
            id
    ){
        $.ajax({
            url: getContextPath() + "/thunderOrder/selectByPrimaryKey",
            data: {
                        id:id
                    },
            success: function (response) {
                //if (response.code != '000') {
                    //如果返回Json中存在标识码等,可以通过下面的方法显示错误信息,
                //    $.utils.alertError(response.message);
              //  } else {
                    var data= $.utils.objToJson(response);

                    $('#updateThunderOrderForm div').removeClass('has-error');

                    $('#updateThunderOrderForm').validate().resetForm();

                    $('#updateThunderOrderForm')[0].reset();

                    $('#updateThunderOrderForm').fill(JSON.parse(data));

                    $('#updateThunderOrderDialog').modal('show');
                //}
            }
        });
    },
    operationBatch:function () {
        //获取选中的所有数据
        var list = $('#thunderOrderTable').bootstrapTable('getAllSelections');

        if(list == null || list.length == 0){
            $.utils.alertWarning("请选择至少一个数据!");
            return;
        }

        $("#batchThunderOrderDialog").modal("show");

    },
    selectByPrimaryKey:function(
            id
    ){
        $.ajax({
            url: getContextPath() + "/thunderOrder/selectByPrimaryKey",
            data: {
                        id:id
                    },
            success: function (response) {
                    var data= $.utils.objToJson(response);

                    $('#showThunderOrderForm')[0].reset();

                    $('#showThunderOrderForm').fill(JSON.parse(data));

                    $('#showThunderOrderDialog').modal('show');

            }
        });
    }

};

/**
 * 所有直接通过操作与后台进行交互的方法
 * @type {{addThunderOrder: $.thunderOrderUtils.submit.addThunderOrder, updateABC: $.thunderOrderUtils.submit.updateThunderOrder, deleteById: $.thunderOrderUtils.submit.deleteById, search: $.thunderOrderUtils.submit.search, batch: $.thunderOrderUtils.submit.batch}}
 */
$.thunderOrderUtils.submit={
    addThunderOrder:function(){
        if($('#addThunderOrderForm').valid()){
            $.utils.submit('/thunderOrder/insert', '#addThunderOrderForm', '#addThunderOrderDialog', '新增出错~', null, '#thunderOrderTable', null, '新增成功~');
        }
    },
    updateThunderOrder:function(){
        if($('#updateThunderOrderForm').valid()){
            $.utils.submit('/thunderOrder/updateByPrimaryKeySelective', '#updateThunderOrderForm', '#updateThunderOrderDialog', '修改出错~', null, '#thunderOrderTable', null, '修改成功~');
        }
    },
    deleteByPrimaryKey:function() {
        $.utils.submit('/thunderOrder/deleteByPrimaryKey', '#deleteThunderOrderForm', '#deleteThunderOrderDialog', '修改出错~', null, '#thunderOrderTable', null, '修改成功~');
    },
    search:function(){

        $("#thunderOrderTable").bootstrapTable('removeAll');

        //重新传递查询条件,也可以修改URL
        $("#thunderOrderTable").bootstrapTable('refreshOptions',{
            url:getContextPath() + "/thunderOrder/selectByPrimaryKey",
            queryParams:function(params){
                return $("#searchForm").serialize();

            },
            responseHandler: function (response) {

                return {
                    rows:new Array(response),
                    totalRecord:1
                }
            }
        });

    },
    batch:function () {
        //获取全部选择的数据
        var list = $('#thunderOrderTable').bootstrapTable('getAllSelections');
        //进行Ajax交互处理数据
    }

};

/**
 * 所有额外处理格式化的方法
 * @type {{operation: $.thunderOrderUtils.formatter.operation}}
 */
$.thunderOrderUtils.formatter={
    operation:function (value, row) {
        var html =  "<div class='btn-toolbar' role='toolbar'>" +
                    "<button type='button' class='btn btn-info' onclick='$.thunderOrderUtils.button.selectByPrimaryKey("
                            + row.id
                    +
                    ")'>查看</button>"+
                    "<button type='button' class='btn btn-primary' onclick='$.thunderOrderUtils.button.updateById("
                            +   row.id
                    +
                    ")'>修改</button>"+
                    "<button type='button' class='btn btn-danger' onclick='$.thunderOrderUtils.button.deleteByPrimaryKey("
                            +   row.id
                    +
                    ")'>删除</button>"+
                    "</div>";
        return  html;
    }
};


