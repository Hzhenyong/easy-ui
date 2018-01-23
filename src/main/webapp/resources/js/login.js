$(function() {

	// ------------------------登陆界面---------------

	$("#login").dialog({
		title : ' 登陆后台',
		width : 350,
		height : 200,
		modal : true,
		buttons : '#btn',

	})
})

// ---------------管理员账号验证-------------

$("#loginName").validatebox({
	required : true,
	missingMessage : "必填项",
	invalidMessage : '用户名不能为空',
})

$("#password").validatebox({
	required : true,
	missingMessage : "必填项",
	// invalidMessage:'密码不能为空',
	validType : 'length[6,20]',

})

// --------------页面加载的时候就先验证一次，这样就可以保证输入框聚焦
$(function() {

	if (!$("#loginName").validatebox("isValid")) { // 如果验证的返回值是false（即：验证不成功）
		$("#loginName").focus(); // 聚焦
	} else if (!$("#password").validatebox("isValid")) {
		$("#password").focus();
	}
})

// ----------------登陆---------

$("#login").bind("keydown", function(e) {
	// 兼容FF和IE和Opera
	var theEvent = e || window.event;
	var code = theEvent.keyCode || theEvent.which || theEvent.charCode;
	if (code == 13) {
		// 回车执行查询
		$("#btn a").click(login());
	}
});

function login() {

	if (!$("#loginName").validatebox("isValid")) { // 如果验证的返回值是false（即：验证不成功）
		$("#loginName").focus(); // 聚焦
	} else if (!$("#password").validatebox("isValid")) {
		$("#password").focus();
	} else {

		$.ajax({
			url : '/user/login',
			data : {
				'loginName' : $("#loginName").val(),
				'password' : $("#password").val()
			},

			beforeSend : function() {
				$.messager.progress({
					text : '正在登陆中.....',
				})
			},
			success : function(data) {
				if (data == "success") {
					window.location.href = "index.jsp";
				} else {
					$.messager.progress('close'); // 关闭正在登陆中.....这个提示框
					$.messager.alert("登陆失败！", "用户名或密码错误！", 'warning',
							function() {
								$("#password").select();// 当 textarea 或文本类型的
														// input 元素中的文本被选择时，会发生
														// select
														// 事件。(这里的作用主要就是当密码输入错误，就将密码输入框设为选中状态，这样当用户点击一下密码输入框的时候密码输入框中的内容会别清空)
							})
				}
			}
		})
	}

}