<%--
  Created by IntelliJ IDEA.
  User: Administrator
  Date: 2019/5/29 0029
  Time: 20:34
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>铁路班列</title>
    <link href="../../css/common.css" rel="stylesheet" type="text/css"/>
    <link href="../../css/reset.css" rel="stylesheet" type="text/css"/>
    <link href="../../css/input.css" rel="stylesheet" type="text/css"/>
    <script type="text/javascript" src="../../js/jquery.1.7.2.min.js"></script>
    <script type="text/javascript" src="../../js/customer2.js"></script>
    <script type="text/javascript" src="../../js/input.js"></script>
    <script src="../../js/scrollfix.js" type="text/javascript"></script>
    <script type="text/javascript" src="/lhbjs/quote.js"></script>
    <script type="text/javascript">
        $(document).ready(function() {

            var summaries = $('.summary');
            summaries.each(function(i) {
                var summary = $(summaries[i]);
                var next = summaries[i + 1];
                if(next){
                    summary.scrollFix({
                        distanceTop: $(".headfix").outerHeight() + 10,
                        endPos: next,
                        zIndex: 998
                    });
                }else{
                    summary.scrollFix({
                        distanceTop: $(".headfix").outerHeight() + 10,
                        endPos: '.footer',
                        zIndex: 998
                    });
                }

            });

        });
    </script>
</head>
<body class="bg_f4">
<div class="bg_fff">
    <div class="page_con">
        <div class="bg_top">
            <ul class="func_top">
                <li class="mL24"><a href="../01_register/register_1.jsp">注册</a></li>
                <li><a class="btnB" href="#" data-dialog="dialog1">登录</a></li>
                <li class="lang_width">
                    <div class="language">
                        <div class="lang clear"> Language <span class="tri"></span> <span class="globe"></span>
                            <div class="flag">
                                <ul>
                                    <li><a href="#"><i class="chs"></i>简体中文</a></li>
                                    <li><a href="#"><i class="hk"></i>繁體中文(香港)</a></li>
                                    <li><a href="#"><i class="us"></i>English(United States)</a></li>
                                    <li><a href="#"><i class="en_hk"></i>English(Hong Kong)</a></li>
                                    <li><a href="#"><i class="tw"></i>繁體中文(台湾)</a></li>
                                    <li><a href="#"><i class="korean"></i>한국어</a></li>
                                    <li><a href="#"><i class="japanese"></i>日本語</a></li>
                                    <li><a href="#"><i class="singapore"></i>English(Singapore)</a></li>
                                    <li><a href="#"><i class="australia"></i>English(Australia)</a></li>
                                    <li><a href="#"><i class="deutsch"></i>Deutsch</a></li>
                                    <li><a href="#"><i class="franc"></i>Français</a></li>
                                    <li><a href="#"><i class="spaish"></i>Español</a></li>
                                    <li><a href="#"><i class="italian"></i>Italiano</a></li>
                                    <li><a href="#"><i class="russian"></i>Русский</a></li>
                                    <li><a href="#"><i class="indonesian"></i>Bahasa Indonesia</a></li>
                                    <li><a href="#"><i class="malay"></i>Bahasa Malaysia</a></li>
                                    <li><a href="#"><i class="thai"></i>ภาษาไทย</a></li>
                                </ul>
                            </div>
                        </div>
                    </div>
                </li>
                <li class="phone">1666666888</li>
            </ul>
        </div>
    </div>
</div>
<div class="bg_header headfix">
    <div class="page_con">
        <h1 class="logo_text"><a href="../../index.jsp"><img alt="" width="100px" height="" src="../../images/logo_text.png"/></a></h1>
        <ul class="nav">
            <li><a href="../04_railway_booking/booking_no_quote.jsp">铁路订舱</a></li>
            <li><a class="current" href="../05_railway_class/railway_class.jsp">铁路班列</a></li>
            <li><a href="../06_order_tracking/order_tracking.jsp">订舱跟踪</a></li>
            <li><a href="../07_about_us/about.jsp">关于平台</a></li>
        </ul>
        <a href="../../index.jsp">
            <h1 class="logo_icon"></h1>
        </a> </div>
</div>
<div class="bg_header_second">
    <div class="page_con"> <a href="../../index.jsp">
        <h2 class="logo_navS"></h2>
    </a>
        <ul class="navS">
            <li><a href="../04_railway_booking/booking_no_quote.jsp">铁路订舱</a></li>
            <li><a class="current" href="../05_railway_class/railway_class.jsp">铁路班列</a></li>
            <li><a href="../06_order_tracking/order_tracking.jsp">订舱跟踪</a></li>
            <li><a href="../07_about_us/about.jsp">关于平台</a></li>
        </ul>
        <ul class="func_top">
            <li class="mL24"><a href="#">注册</a></li>
            <li><a class="btnB" data-dialog="dialog1" href="#">登录</a></li>
            <li class="lang_width">
                <div class="language">
                    <div class="lang clear"> Language <span class="tri"></span> <span class="globe"></span>
                        <div class="flag">
                            <ul>
                                <li><a href="#"><i class="chs"></i>简体中文</a></li>
                                <li><a href="#"><i class="hk"></i>繁體中文(香港)</a></li>
                                <li><a href="#"><i class="us"></i>English(United States)</a></li>
                                <li><a href="#"><i class="en_hk"></i>English(Hong Kong)</a></li>
                                <li><a href="#"><i class="tw"></i>繁體中文(台湾)</a></li>
                                <li><a href="#"><i class="korean"></i>한국어</a></li>
                                <li><a href="#"><i class="japanese"></i>日本語</a></li>
                                <li><a href="#"><i class="singapore"></i>English(Singapore)</a></li>
                                <li><a href="#"><i class="australia"></i>English(Australia)</a></li>
                                <li><a href="#"><i class="deutsch"></i>Deutsch</a></li>
                                <li><a href="#"><i class="franc"></i>Français</a></li>
                                <li><a href="#"><i class="spaish"></i>Español</a></li>
                                <li><a href="#"><i class="italian"></i>Italiano</a></li>
                                <li><a href="#"><i class="russian"></i>Русский</a></li>
                                <li><a href="#"><i class="indonesian"></i>Bahasa Indonesia</a></li>
                                <li><a href="#"><i class="malay"></i>Bahasa Malaysia</a></li>
                                <li><a href="#"><i class="thai"></i>ภาษาไทย</a></li>
                            </ul>
                        </div>
                    </div>
                </div>
            </li>
            <li class="phone">1666666888</li>
        </ul>
    </div>
</div>

<div class="right_suspension">
    <ul>
        <li><a href="../../index.jsp">
            <div class="sidebox"><i class="rs_1"></i>返回首页</div>
        </a></li>
        <li><a href="#">
            <div class="sidebox"><i class="rs_2"></i>1-666-888</div>
        </a></li>
        <li><a class="bounceInRight dialog_help demo40" href="#" >
            <div class="sidebox"><i class="rs_3"></i>需要帮助吗？</div>
        </a></li>
        <li><a href="#" >
            <div class="sidebox sidebox_wx"><i class="rs_4"></i><img src="../../images/qrcode.png" alt=""/></div>
        </a></li>
        <li><a href="#" >
            <div class="sidebox"><i class="rs_5"></i>在线客服</div>
        </a></li>
        <li style="border:none;"><a href="javascript:goTop();" class="sidetop"><i class="rs_6"></i></a></li>
    </ul>
</div>
<div class="content">
    <div class="bg_step">
        <ul class="step_reg">
            <li class="done"><i>1</i>报价</li>
            <li class="step_tri"></li>
            <li class="current"><i>2</i>报价单</li>
            <li class="step_tri"></li>
            <li><i>3</i>委托信息</li>
            <li class="step_tri"></li>
            <li><i>4</i>完成</li>
        </ul>
    </div>

    <div class="bg_class_cu" id="quote">

    </div>
    <div class="bg_com pTB_40 mTop_20 clear">
        <h2 class="title_main">费用包含</h2>

        <div class="fl_main_con">
            <div class="quotation">
                <table>
                    <tr>
                        <th>陆运费：</th>
                        <td>RMB ${yunfei}</td>
                    </tr>
                    <tr>
                        <th>服务费：</th>
                        <td>RMB ${fuwu}</td>
                    </tr>
                </table>
                <p class="zy">注：其他未列明费用请以客服告知或平台数据为准</p>
            </div>
        </div>

        <div class="total summary">

            <table>
                <tr>
                    <th>费用总计</th>
                    <td>RMB</td>
                    <td>${money}&nbsp;<i href="#">?

                        <div class="t_to">注:待定费用未计入费用总计,届时以客服告知或rail订单数据为准</div>
                    </i></td>

                </tr>

            </table>
            <ul class="wrap_quo">

                <li>
                    <a class="btn_C" href="/pages/05_railway_class/3_entrust_info.jsp">立即委托</a>
                </li>
                <li>
                    <a class="export">导出报价单</a>
                </li>
            </ul>

        </div>



    </div>
</div>


<!--右侧帮助-->
<div id="HBox">
    <div class="head_help">
        <h2>帮助</h2>
        <div class="bg_w_search fL margin_se_help"><a class="se" href="#"></a>
            <input type="text" value="" placeholder="您有什么需要帮忙的"/>
        </div>
    </div>
    <div class="list_help">
        <ul>
            <li class="title">为您推荐</li>
            <li><a href="#"><i></i>国内可以安排退货吗？</a></li>
            <li><a href="#"><i></i>国外段可以送货吗？</a></li>
            <li><a href="#"><i></i>下单时提货方式怎么选择？</a></li>
            <li><a href="#"><i></i>铁路运输的速度怎么样的速度怎么样的速度怎么样？</a></li>
            <li><a href="#"><i></i>铁路中的运单是提货凭证？</a></li>
            <li><a href="#"><i></i>我有货物要送亚马逊仓库，有什么要求吗？</a></li>
            <li><a href="#"><i></i>海关对货物的查验有哪些要求？</a></li>
            <li><a href="#"><i></i>当货物查验时需要提供哪些材料？</a></li>
            <li class="phone"><i></i>联系客服：<span>1666 666 888</span></li>
        </ul>
    </div>
</div>
<div class="footer">
    <div class="page_con">
        <ul class="nav_foot">
            <li><a href="#">铁路订舱</a></li>
            <li><a href="#">铁路班列</a></li>
            <li><a href="#">订舱跟踪</a></li>
            <li><a href="#">关于平台</a></li>
        </ul>
        <div class="phone_foot">客服热线：1666 666 888</div>
        <div class="copyright">Copyright © 2017 - 2018 xxxx.com 版权所有</div>
    </div>
</div>

<div class="tcp_bg"></div>
<script src="../../js/banner.js" type="text/javascript"></script>
<script src="../../js/slider.js" type="text/javascript"></script>


</body>
</html>
