var locat = (window.location+'').split('/'); 
$(function(){if('main'== locat[3]){locat =  locat[0]+'//'+locat[2];}else{locat =  locat[0]+'//'+locat[2]+'/'+locat[3];};});

//菜单状态切换
var fmid = "fhindex";
var mid = "fhindex";
function siMenu(id,fid,MENU_NAME,MENU_URL) {
	if(id != mid){
		$("#"+mid).removeClass();
		mid = id;
	}
	if(fid != fmid){
		$("#"+fmid).removeClass();
		fmid = fid;
	}
/*	$("#"+fid).prevAll().children("ul").css('display','none'); 
	$("#"+fid).nextAll().children("ul").css('display','none'); */
	$("#sidebar").find(".submenu").hide();
	$("#"+fid).children("ul").show();
	$("#"+fid).attr("class","active open");
	$("#"+id).attr("class","active");
	top.mainFrame.tabAddHandler(id,MENU_NAME,MENU_URL);
}

function siMenuNoAction(id,fid,MENU_NAME,MENU_URL) {
	if(id != mid){
		$("#"+mid).removeClass();
		mid = id;
	}
	if(fid != fmid){
		$("#"+fmid).removeClass();
		fmid = fid;
	}
	$("#"+fid).attr("class","active open");
	$("#"+id).attr("class","active");
	top.mainFrame.tabAddNoActionHandler(id,MENU_NAME,MENU_URL);
}

$(function() {
	//换肤
	$("#skin-colorpicker").ace_colorpicker().on("change",function() {
		var b=$(this).find("option:selected").data("class");
		hf(b);
	});
	
});

//var USER_ID;
//var user;	//用于即时通讯（ 当前登录用户）
//$(function(){
//	$.ajax({
//		type: "POST",
//		url: locat+'/mainAction/getUser.json?tm='+new Date().getTime(),
//    	data: encodeURI(""),
//		dataType:'json',
//		//beforeSend: validateData,
//		cache: false,
//		success: function(data){
//			//登陆者资料
//			$("#user_info").html('<small>Welcome</small> '+data.data.name+'');
//			user = data.data.username;
//			USER_ID = data.data.id;//用户ID
//		}
//	});
//});

//换肤
function hf(b) {
	var a = $(document.body);
	a.attr("class", a.hasClass("navbar-fixed") ? "navbar-fixed" : "");
	if (b != "default") {
		a.addClass(b);
	}
	if (b == "skin-1") {
		$(".ace-nav > li.grey").addClass("dark");
	} else {
		$(".ace-nav > li.grey").removeClass("dark");
	}
	if (b == "skin-2") {
		$(".ace-nav > li").addClass("no-border margin-1");
		$(".ace-nav > li:not(:last-child)").addClass("white-pink").find('> a > [class*="icon-"]').addClass("pink").end().eq(0).find(".badge").addClass("badge-warning");
	} else {
		$(".ace-nav > li").removeClass("no-border").removeClass("margin-1");
		$(".ace-nav > li:not(:last-child)").removeClass("white-pink").find('> a > [class*="icon-"]').removeClass("pink").end().eq(0).find(".badge").removeClass("badge-warning");
	}
	if (b == "skin-3") {
		$(".ace-nav > li.grey").addClass("red").find(".badge").addClass("badge-yellow");
	} else {
		$(".ace-nav > li.grey").removeClass("red").find(".badge").removeClass("badge-yellow");
	}
}

//修改个人资料
function editUserH() {
//	 var diag = new top.Dialog();
//	 diag.Drag=true;
//	 diag.Title ="个人资料";
//	 diag.URL = locat+'/user/goEditU.do?USER_ID='+USER_ID+'&fx=head';
//	 diag.Width = 225;
//	 diag.Height = 389;
//	 diag.CancelEvent = function(){ //关闭事件
//		diag.close();
//	 };
//	 diag.show();
}

//系统设置
function editSys() {
//	 var diag = new top.Dialog();
//	 diag.Drag=true;
//	 diag.Title ="系统设置";
//	 diag.URL = locat+'/head/goSystem.do';
//	 diag.Width = 600;
//	 diag.Height = 596;
//	 diag.CancelEvent = function(){ //关闭事件
//		diag.close();
//	 };
//	 diag.show();
}

function changeDuty(dutyId){
	$.ajax({
		url:locat + '/bc/loginUserAction/changeDuty.action',
		data:{
			dutyId:dutyId
		},
		type:'post',
		dataType:'json',
		success:function(data){
			if(data.state == 'success'){
				location.href = locat + '/mainAction/main.action';
			}else{
				alert(data.message);
			}
		},error:function(){
			alert("职责切换失败");
		}
	});
}