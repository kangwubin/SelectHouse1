<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@page import="entry.HouseSource"%>
<%@page import="java.util.List"%>
<%@	page import="entry.Staff"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>购房摇号系统后台</title>
<link href="/selsectHouse/afterView/css/main.css" rel="stylesheet">
<script src="/selsectHouse/afterView/js/jquery.min.js"></script>
<script src="/selsectHouse/afterView/js/layer.js"></script>
<link rel="stylesheet" href="/selsectHouse/afterView/css/layer.css"
	id="layuicss-layer">
<script src="/selsectHouse/afterView/js/main.js"></script>
</head>
<body>

	<div class="aspNetHidden">
		<input type="hidden" name="__EVENTTARGET" id="__EVENTTARGET" value="">
		<input type="hidden" name="__EVENTARGUMENT" id="__EVENTARGUMENT"
			value=""> <input type="hidden" name="__VIEWSTATE"
			id="__VIEWSTATE"
			value="rLaTylGP9uJooVBhpqXhG4aIfXP+rYtUsMT+avGGGI8GGBY/n5tM3eOESKviTjtCOWwu1nntBL8W4WuD7QvXLg7RWHApNEoeLgg+s6u3S0k=">
	</div>

	<script type="text/javascript">
		//<![CDATA[
		var theForm = document.forms['form1'];
		if (!theForm) {
			theForm = document.form1;
		}
		function __doPostBack(eventTarget, eventArgument) {
			if (!theForm.onsubmit || (theForm.onsubmit() != false)) {
				theForm.__EVENTTARGET.value = eventTarget;
				theForm.__EVENTARGUMENT.value = eventArgument;
				theForm.submit();
			}
		}
		//]]>
	</script>


	<script src="/selsectHouse/afterView/WebResource.axd"
		type="text/javascript"></script>


	<script src="/selsectHouse/afterView/WebResource(1).axd"
		type="text/javascript"></script>
	<div class="aspNetHidden">

		<input type="hidden" name="__VIEWSTATEGENERATOR"
			id="__VIEWSTATEGENERATOR" value="4E920C22"> <input
			type="hidden" name="__EVENTVALIDATION" id="__EVENTVALIDATION"
			value="zaeFN5M+Yn1/6QCyAUQIlx/HnT63/RP/Eg+13YQP4zcE1y6wmMXMqFxOwgVKcWKLF/I2lblijC4a/R7FfAM9hGNqkbECf1bzFpaqLbR9S90QnqIkhcjHw7LZXknhh365G52nIPcie34ayYUduCOGvg==">
	</div>


	<link href="/selsectHouse/afterView/css/header.css" rel="stylesheet">
	<div id="Wuc_header_header00" class="header header00 top00">
		<img src="/selsectHouse/afterView/img/topimg00.jpg">
	</div>



	<input type="hidden" name="hidDayDjsj" id="hidDayDjsj" value="8-18">
	<div class="bgwhite caq_tbtsdiv">

		<img src="/selsectHouse/afterView/img/1234.png">

		<div class="caq_tbts">

			<div class="caq_tbtsTxt">
				根据我市人民政府办公厅《关于进一步加强管理保持房地产市场持续平稳健康发展的若干意见》(市政发[2017]23号)、《关于调整我市住房交易政策有关问题的通知》(市政办发[2017]59号)、《关于进一步稳定住房市场发展有关问题的通知》(市政发[2017]51号)、《关于进一步规范商品住房交易秩序有关问题的通知》（市政办发[2018]61号）的相关要求,因意向购房登记人多于可售房源,故采用公证摇号排序选房方式出售房源。
			</div>
		</div>
	</div>
	<div class="content">
		<div class="bgwhite  mag_tb">
			<div class="mag_b10 prel pad_10 pad_t25">
				<div class="tc size22 pad_lr20">销售公告发布</div>
			</div>
			<div></div>
			<div class="grayLine"></div>
			<div class=" mag_b20 pad_20">
				<div class="bgwhite caq_tbtsdiv1">
					<!--  在这里加东西 -->
					<!-- servlet实现 -->
					<br> <br>
					<table border="1" cellpadding="10" cellspacing="0" width="1000" style="margin-right:8px;">
						<tr>
							<th>楼盘名称</th>
							<th>开发企业名称</th>
							<th>现场接收资料时间</th>
							<th>现场接收资料地点</th>
							<th>预（现）售楼幢号</th>
							<th>预（现）售证号</th>
							<th>提交</th>
						</tr>
						<tr>
							<td><input value="" name="starTime"></td>
							<td><input value="" name="starTime"></td>
							<td><input value="" name="starTime"></td>
							<td><input value="" name="starTime"></td>
							<td><input value="" name="starTime"></td>
							<td><input value="" name="starTime"></td>

				<td><a href="/selsectHouse/StaffServlet?method=staffDelet&id">发布</a></td>
						</tr>
					</table>
				</div>
			</div>
		</div>
	</div>
	<script type="text/javascript">
		xmgsload();
	</script>
	<script type="text/javascript">
		//<![CDATA[
		WebForm_AutoFocus('btnSubmit');//]]>
	</script>
</body>
</html>