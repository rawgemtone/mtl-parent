﻿<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<head>
<meta http-equiv="Content-Type" content="text/html; charset=utf-8" />
<title>iphone 7的30天内回收平均价格3360元-麦淘乐 - 二手数码回收平台</title>
<meta name="keywords" content="iphone 7 iphone7 7 苹果7 苹果 7" />
<meta name="description" content="iphone 7 iphone7 7 苹果7 苹果 7" />
<meta name="baidu-site-verification" content="IpuQLFxZiC" />
<meta name="chinaz-site-verification"
	content="081e7651-48c6-4c2f-a569-99321685eab1" />
<meta name="applicable-device" content="pc">
<link href="http://www.qfedu.com/favicon.ico" type="image/x-icon"
	rel="Icon">
<link href="${pageContext.request.contextPath}/css/new_css/global.css"
	rel="stylesheet" type="text/css">
<script
	src="${pageContext.request.contextPath}/js/new_js/jquery-1.4.2.js"
	type="text/javascript"></script>
<script src="${pageContext.request.contextPath}/js/new_js/new_public.js"
	type="text/javascript"></script>
<script type="text/javascript">
	
</script>
<link href="${pageContext.request.contextPath}/css/new_css/sub.css"
	rel="stylesheet" type="text/css">
<script src="${pageContext.request.contextPath}/js/public.js"
	type="text/javascript"></script>
<script src="${pageContext.request.contextPath}/js/new_js/menu.js"
	type="text/javascript"></script>
<script src="${pageContext.request.contextPath}/js/new_js/new_goods.js"
	type="text/javascript"></script>
</head>
<body>
	<link rel="stylesheet" type="text/css"
		href="${pageContext.request.contextPath}/css/alert_zhe.css" />
	<script type="text/javascript"
		src="${pageContext.request.contextPath}/js/alert_zhe.js"></script>
	<!--头部-->
	<!--手机回收-->
	<div class="recovery">
		<script type="text/javascript">
			$(document).ready(function() {
				$(".new_search_btn").click(function() {
					$(".new_search").slideToggle();
				});
			});
		</script>
		<div class="page2" style="position: relative">
			<div class="new_search_btn"
				style="position: absolute; left: -40px; top: -11px; cursor: pointer;">
				<img
					src="${pageContext.request.contextPath}/images/new_images/search_btn.png"
					alt="搜索您要评估价格的机型" />
			</div>

			<div style="height: 30px; line-height: 30px; font-size: 14px;">
				<a href="">首页</a> &gt;<a href="ershoushouji.html">手机</a> &gt;<a
					href="ershouiphone.html">${productById.productName }</a> &gt;
				${productById.productCode }
			</div>
			<div class="heat_l">
				<div class="heat_img">
					<img src="${productById.imageId }"
						alt="${productById.productCode }回收价格评估" width="264" height="197" />
				</div>
				<div class="heat_txt">
					<div class="heat_name">
						<span>${productById.productCode }</span>
					</div>
					<dl class="heat_ts">
						<dd>
							<em>3360</em>元<br /> 30天内回收最高价
						</dd>
						<dt class="clear"></dt>
					</dl>
					<div class="heat_bao">
						<img
							src="${pageContext.request.contextPath}/images/new_images/icon10.gif"
							alt="iphone 7回收免费享受第三方理赔服务" />可免费享受第三方理赔服务
					</div>
					<div class="clear"></div>
				</div>
				<div class="clear"></div>
			</div>
			<script
				src="${pageContext.request.contextPath}/js/new_js/morris/raphael-2.1.0.min.js"></script>
			<script
				src="${pageContext.request.contextPath}/js/new_js/morris/morris.js"></script>
			<link rel="stylesheet"
				href="${pageContext.request.contextPath}/js/new_js/morris/morris.css">
			<div class="heat_r">
				<div class="heat_title">
					<span>回购价格趋势</span>
					<samp>单位：元</samp>
				</div>
				<div class="heat_pic">
					<div id="graph"
						style="width: 360px; height: 210px; margin-top: 0px;"></div>
				</div>
				<script>
					var day_data = [ {
						"elapsed" : "7",
						"价格" : "2614"
					}, {
						"elapsed" : "8",
						"价格" : "2607"
					}, {
						"elapsed" : "9",
						"价格" : "2660"
					}, {
						"elapsed" : "10",
						"价格" : "2822"
					}, {
						"elapsed" : "11",
						"价格" : "2929"
					} ];
					Morris.Line({
						element : 'graph',
						data : day_data,
						xkey : 'elapsed',
						ykeys : [ '价格' ],
						labels : [ '价格' ],
						parseTime : false
					});
				</script>
			</div>
			<div class="clear"></div>
		</div>
	</div>
	<!--手机回收-->
	<!--评估流程-->
	<div id="ahs_trade_body">
		<input type="hidden" id="view" value="goods_info" /> <input
			type="hidden" id="if_show_price" value="1" /> <input type="hidden"
			id="gid" name="gid" value="21025" /> <input type="hidden"
			id="package_id" name="package_id" value="571" />
		<div id="ahs_property_head">
			<p>开始评估你的手机，只需3步，获得产品精准评估报价</p>
			<!--步骤一-->
			<div class="speed" id="speed1">
				<img
					src="${pageContext.request.contextPath}/images/new_images/step1.gif"
					alt="第1步评估手机的基本情况" />
			</div>
			<!--步骤一-->
			<!--步骤二-->
			<div class="speed" id="speed2">
				<img
					src="${pageContext.request.contextPath}/images/new_images/step2.gif"
					alt="第2步评估手机的功能使用情况" />
			</div>
			<!--步骤二-->
			<!--步骤三-->
			<div class="speed" id="speed3">
				<img
					src="${pageContext.request.contextPath}/images/new_images/step3.gif"
					alt="第一步评估手机的外观成色" />
			</div>
			<!--步骤三-->
		</div>
		<div id="ahs_property_body">
			<!--第一步-->
			<div id="property_step1">
				<dl>
					<c:forEach items="${attrTypeList}" var="attrType">
						<c:if test="${attrType.attrPage==1}">
							<dd>
								<input type="hidden" name="property[]" id="property_${attrType.attrTypeId}" value="0" />
								<div class="property_title">
									<h3>${attrType.attrTypeName}</h3>
								</div>
								<ul>
									<c:forEach items="${attrInfoList}" var="attrInfo">
										<c:if test="${attrInfo.bak1 == attrType.attrTypeId}">
											<li class="" onClick="property_click(this,'${attrType.attrTypeId}','${attrInfo.attrId}')" name="'mx_child_'+${attrType.attrTypeId}">
												<div class="pro_div">
													<span class="property_value"><i>${attrInfo.attrName }</i>
													<ins>${attrInfo.attrDes }</ins></span><span class="gou"></span>
												</div>
											</li>
										</c:if>
									</c:forEach>
									<div class="clear"></div>
								</ul>
							</dd>
						</c:if>
					</c:forEach>
					<div id="step1_nav" class="property_nav">
						<div id="btn_step1_next" class="btn_next">下一步</div>
					</div>
				</dl>
			</div>
			<!--第一步-->
			<!--第二步-->
			<div id="property_step2" class="hide">
				<dl>
					<c:forEach items="${attrTypeList}" var="attrType">
						<c:if test="${attrType.attrPage==2}">
							<dd>
								<div class="property_title">
									<h3>${attrType.attrTypeName}</h3>
								</div>
								<ul>
									<c:forEach items="${attrInfoList}" var="attrInfo">
										<c:if test="${attrInfo.bak1 == attrType.attrTypeId}">
											<!-- <input type="hidden" name="desc_pid[]" value="944" /> -->
											<input type="hidden" name="desc_id[]" id="desc_id_${attrInfo.attrId}" value="0" />
											<li onClick="item_click(this,'${attrInfo.attrId}')" name="mx_child_${attrType.attrTypeId}">
												<div class="pro_div">
													<span class="property_value"><i>${attrInfo.attrName }</i>
													<ins>${attrInfo.attrDes }</ins></span> <span class="gou"></span>
												</div>
											</li>
										</c:if>
									</c:forEach>
									<div class="clear"></div>
								</ul>
							</dd>
						</c:if>
					</c:forEach>
				</dl>
				<div id="step2_nav" class="property_nav">
					<div id="btn_step2_back" class="btn_back">< 返回上一步</div>
					<div id="btn_step2_next" class="btn_next">都没问题，跳过 ></div>
				</div>
			</div>
			<!--第二步-->
			<!--第三步-->
			<div id="property_step3" class="hide">
				<dl>
					<c:forEach items="${attrTypeList}" var="attrType">
						<c:if test="${attrType.attrPage==3}">
							<dd>
								<input type="hidden" name="property[]" id="property_${attrType.attrTypeId}" value="0" />
								<div class="property_title">
									<h3>${attrType.attrTypeName}</h3>
								</div>
								<ul>
									<c:forEach items="${attrInfoList}" var="attrInfo">
										<c:if test="${attrInfo.bak1 == attrType.attrTypeId}">
											<li class="" onClick="property_click(this,'${attrType.attrTypeId}','${attrInfo.attrId}')" name="'mx_child_'+${attrType.attrTypeId}">
												<div class="pro_div">
													<span class="property_value"><i>${attrInfo.attrName }</i>
													<ins>${attrInfo.attrDes }</ins></span><span class="gou"></span>
												</div>
											</li>
										</c:if>
									</c:forEach>
									<div class="clear"></div>
								</ul>
							</dd>
						</c:if>
					</c:forEach>
				</dl>
				<div id="step3_nav" class="property_nav">
					<div id="btn_step3_back" class="btn_back">< 返回上一步</div>
					<div id="btn_step3_next" class="btn_next"
						onclick="idsPrice()">查看价格></div>
				</div>
			</div>
			<!--第三步-->
		</div>
	</div>
	<!--评估流程-->
	<!--隐藏的评估描叙选项start-->
	<div style="display: none; background-color: #CCCCCC;"></div>
	<!--隐藏的评估描叙选项end-->
	<script>
	function idsPrice(){
		var productId = ${productById.productId};
		
		var discount_ids=new Array();
	 	var j=0;
	 	$("input[name='property[]']").each(function () {
			var ids=$(this).val();
		 //单选框value非空非0判断
			 if(null != ids && 0 != ids){
			 discount_ids[j++] = ids;
		 	}
	 	});
	 	
	 	$("input[name='desc_id[]']").each(function () {
	 		var ids=$(this).val();
			 //多选框value非空非0判断
				 if(null != ids && 0 != ids){
				 discount_ids[j++] = ids;

			 	}
	 	}); 
	 	/*alert(discount_ids);  */
	 	window.location.href="${pageContext.request.contextPath}/price/toprice.do?productId=" + productId+"&discount_ids="+discount_ids;
	}
		$(document).ready(function() {
			$("#step1_nav .btn_next").bind('click', step1_next);
			$("#step2_nav .btn_next").bind('click', step2_next);
			$("#step2_nav .btn_back").bind('click', step2_back);
			$("#step3_nav .btn_back").bind('click', step3_back);

			$("input[name='property[]']").each(function() {
				$(this).val(0);
			})
			$("#property_step1 input[name='desc_id[]']").each(function() {
				$(this).val(0);
			})
			$("#property_step3 input[name='desc_id[]']").each(function() {
				$(this).val(0);
			})
			$("#pj_ids").val(0);
		})
	</script>
	<!--[if lte IE 6]>
<script src="${pageContext.request.contextPath}/js/new_js/png.js" type="text/javascript"></script>
<script type="text/javascript">
    DD_belatedPNG.fix('img,.banner ul, li, dl, dt, dd, span, em, div, oi, samp, a, b, .kuang');
</script>
<![endif]-->

</body>
</html>
