<!DOCTYPE html>
<html>
<%@ page pageEncoding="utf-8"%>
<head>
    <meta charset="utf-8">
    <meta name="viewport" content="width=device-width, initial-scale=1, maximum-scale=1">
    <title>WBG物流管理系统</title>
    <link rel="stylesheet" href="./plugins/layui/css/layui.css" media="all"/>
    <link rel="stylesheet" href="./plugins/font-awesome/css/font-awesome.min.css" media="all"/>
    <link rel="stylesheet" href="./src/css/app.css" media="all"/>
    <link rel="stylesheet" href="./src/css/themes/default.css" media="all" id="skin" kit-skin/>
</head>

<body class="kit-theme">
<div class="layui-layout layui-layout-admin kit-layout-admin">
    <div class="layui-header">
        <div class="layui-logo">WBG物流管理系统</div>
        <div class="layui-logo kit-logo-mobile"></div>
        <ul class="layui-nav layui-layout-left kit-nav">
            <li class="layui-nav-item"><a href="javascript:;">控制台</a></li>

        </ul>
        <ul class="layui-nav layui-layout-right kit-nav">
            <li class="layui-nav-item">
                <a href="javascript:;">
                    <i class="layui-icon">&#xe63f;</i> 皮肤
                </a>
                <dl class="layui-nav-child skin">
                    <dd><a href="javascript:;" data-skin="default" style="color:#393D49;"><i
                            class="layui-icon">&#xe658;</i> 默认</a></dd>
                    <dd><a href="javascript:;" data-skin="orange" style="color:#ff6700;"><i
                            class="layui-icon">&#xe658;</i> 橘子橙</a></dd>
                    <dd><a href="javascript:;" data-skin="green" style="color:#00a65a;"><i
                            class="layui-icon">&#xe658;</i> 原谅绿</a></dd>
                    <dd><a href="javascript:;" data-skin="pink" style="color:#FA6086;"><i
                            class="layui-icon">&#xe658;</i> 少女粉</a></dd>
                    <dd><a href="javascript:;" data-skin="blue.1" style="color:#00c0ef;"><i
                            class="layui-icon">&#xe658;</i> 天空蓝</a></dd>
                    <dd><a href="javascript:;" data-skin="red" style="color:#dd4b39;"><i class="layui-icon">&#xe658;</i>
                        枫叶红</a></dd>
                </dl>
            </li>
            <li class="layui-nav-item">
                <a href="javascript:;">
                    <img src="img/psb.jpg" class="layui-nav-img"> WBG
                </a>
                <dl class="layui-nav-child">
                    <dd><a href="javascript:;" kit-target
                           data-options="{url:'basic.html',icon:'&#xe658;',title:'基本资料',id:'966'}"><span>基本资料</span></a>
                    </dd>
                    <dd><a href="javascript:;">安全设置</a></dd>
                </dl>
            </li>
            <li class="layui-nav-item"><a href="login.html"><i class="fa fa-sign-out" aria-hidden="true"></i> 注销</a>
            </li>
        </ul>
    </div>

    <div class="layui-side layui-bg-black kit-side">
        <div class="layui-side-scroll">
            <div class="kit-side-fold"><i class="fa fa-navicon" aria-hidden="true"></i></div>
            <!-- 左侧导航区域（可配合layui已有的垂直导航） -->
            <ul class="layui-nav layui-nav-tree" lay-filter="kitNavbar" kit-navbar>
                <li class="layui-nav-item layui-nav-itemed">
                    <a class="" href="javascript:;"><i class="fa fa-plug" aria-hidden="true"></i><span> 员工管理</span></a>
                    <dl class="layui-nav-child">
                        <dd>
                            <a href="javascript:;" kit-target
                               data-options="{url:'mains.jsp',icon:'&#xe6c6;',title:'公司结构',id:'1'}">
                                <i class="layui-icon">&#xe6c6;</i><span> 公司结构</span></a>
                        </dd>
                        <dd>
                            <a href="javascript:;" data-url="employee.jsp" data-icon="fa-user" data-title="查询员工信息" kit-target
                               data-id='2'>
                                <i class="fa fa-user" aria-hidden="true"></i><span> 查询员工信息</span></a>
                        </dd>
                        <dd>
                            <a href="javascript:;" data-url="/depart" data-icon="&#xe614;" data-title="添加员工信息"
                               kit-target data-id='4'><i class="layui-icon">&#xe614;</i><span> 添加员工信息</span></a>
                        </dd>
                    </dl>
                </li>
                <li class="layui-nav-item">
                    <a href="javascript:;"><i class="fa fa-user" aria-hidden="false"></i><span> 车辆管理</span></a>
                    <dl class="layui-nav-child">
                        <dd>
                            <a href="javascript:;" data-url="vehicle.jsp" data-icon="fa-user" data-title="查询车辆信息" kit-target
                               data-id='5'>
                                <i class="fa fa-user" aria-hidden="true"></i><span> 查询车辆信息</span></a>
                        </dd>
                        <dd>
                            <a href="javascript:;" data-url="/vehicle" data-icon="&#xe614;" data-title="添加车辆信息"
                               kit-target data-id='7'><i class="layui-icon">&#xe614;</i><span> 添加车辆信息</span></a>
                        </dd>
                    </dl>
                </li>
                <li class="layui-nav-item">
                    <a href="javascript:;"><i class="fa fa-plug" aria-hidden="true"></i><span> 路线管理</span></a>
                    <dl class="layui-nav-child">
                        <dd>
                            <a href="javascript:;" data-url="route.jsp" data-icon="fa-user" data-title="查询路线信息" kit-target
                               data-id='8'>
                                <i class="fa fa-user" aria-hidden="true"></i><span> 查询路线信息</span></a>
                        </dd>
                        <dd>
                            <a href="javascript:;" data-url="/route" data-icon="&#xe614;" data-title="添加路线信息"
                               kit-target data-id='10'><i class="layui-icon">&#xe614;</i><span> 添加路线信息</span></a>
                        </dd>
                    </dl>
                </li>
                <li class="layui-nav-item">
                    <a href="javascript:;"><i class="fa fa-plug" aria-hidden="true"></i><span> 运单管理</span></a>
                    <dl class="layui-nav-child">
                        <dd>
                            <a href="javascript:;" data-url="waybill.jsp" data-icon="fa-user" data-title="查询运单信息" kit-target
                               data-id='11'>
                                <i class="fa fa-user" aria-hidden="true"></i><span> 查询运单信息</span></a>
                        </dd>
                        <dd>
                            <a href="javascript:;" data-url="/waybill" data-icon="&#xe628;" data-title="添加运单信息" kit-target
                               data-id='12'><i class="layui-icon">&#xe628;</i><span> 添加运单信息</span></a>
                        </dd>
                        <dd>
                            <a href="javascript:;" data-url="/positions" data-icon="&#xe614;" data-title="实时运单信息"
                               kit-target data-id='13'><i class="layui-icon">&#xe614;</i><span> 实时运单信息</span></a>
                        </dd>
                    </dl>
                </li>
                <li class="layui-nav-item">
                    <a href="javascript:;"><i class="fa fa-plug" aria-hidden="true"></i><span> 调度安排</span></a>
                    <dl class="layui-nav-child">
                        <dd>
                            <a href="javascript:;" data-url="form.html" data-icon="fa-user" data-title="查询调度单" kit-target
                               data-id='14'>
                                <i class="fa fa-user" aria-hidden="true"></i><span> 查询调度单</span></a>
                        </dd>
                        <dd>
                            <a href="javascript:;" data-url="nav.html" data-icon="&#xe628;" data-title="车辆关联" kit-target
                               data-id='15'><i class="layui-icon">&#xe628;</i><span> 车辆关联</span></a>
                        </dd>
                        <dd>
                            <a href="javascript:;" data-url="list4.html" data-icon="&#xe614;" data-title="路线关联"
                               kit-target data-id='16'><i class="layui-icon">&#xe614;</i><span> 路线关联</span></a>
                        </dd>
                    </dl>
                </li>
                <li class="layui-nav-item">
                    <a href="javascript:;"><i class="fa fa-plug" aria-hidden="true"></i><span> 信息管理</span></a>
                    <dl class="layui-nav-child">
                        <dd><a href="javascript:;" kit-target
                               data-options="{url:'navbar.html',icon:'&#xe658;',title:'Navbar',id:'6'}"><i
                                class="layui-icon">&#xe658;</i><span> Navbar</span></a></dd>
                        <dd><a href="javascript:;" kit-target
                               data-options="{url:'tab.html',icon:'&#xe658;',title:'TAB',id:'7'}"><i class="layui-icon">&#xe658;</i><span> Tab</span></a>
                        </dd>
                        <dd><a href="javascript:;" kit-target
                               data-options="{url:'onelevel.html',icon:'&#xe658;',title:'OneLevel',id:'50'}"><i
                                class="layui-icon">&#xe658;</i><span> OneLevel</span></a></dd>
                        <dd><a href="javascript:;" kit-target
                               data-options="{url:'app.html',icon:'&#xe658;',title:'App',id:'8'}"><i class="layui-icon">&#xe658;</i><span> app.js主入口</span></a>
                        </dd>
                    </dl>
                </li>
                <li class="layui-nav-item">
                    <a href="javascript:;"><i class="fa fa-plug" aria-hidden="true"></i><span> 权限分配</span></a>
                    <dl class="layui-nav-child">
                        <dd><a href="javascript:;" kit-target
                               data-options="{url:'navbar.html',icon:'&#xe658;',title:'Navbar',id:'6'}"><i
                                class="layui-icon">&#xe658;</i><span> Navbar</span></a></dd>
                        <dd><a href="javascript:;" kit-target
                               data-options="{url:'tab.html',icon:'&#xe658;',title:'TAB',id:'7'}"><i class="layui-icon">&#xe658;</i><span> Tab</span></a>
                        </dd>
                        <dd><a href="javascript:;" kit-target
                               data-options="{url:'onelevel.html',icon:'&#xe658;',title:'OneLevel',id:'50'}"><i
                                class="layui-icon">&#xe658;</i><span> OneLevel</span></a></dd>
                        <dd><a href="javascript:;" kit-target
                               data-options="{url:'app.html',icon:'&#xe658;',title:'App',id:'8'}"><i class="layui-icon">&#xe658;</i><span> app.js主入口</span></a>
                        </dd>
                    </dl>
                </li>
            </ul>
        </div>
    </div>
    <div class="layui-body" id="container">
        <!-- 内容主体区域 -->
        <div style="padding: 15px;"><i class="layui-icon layui-anim layui-anim-rotate layui-anim-loop">&#xe63e;</i>
            请稍等...
        </div>
    </div>

    <div class="layui-footer">
        <!-- 底部固定区域 -->
        2018 &copy;
        <a href="http://kit.zhengjinfan.cn/">WBG物流管理系统</a>
       <!-- <marquee>WBG物流管理系统</marquee>-->
    </div>
</div>
<!-- <script type="text/javascript">
      var cnzz_protocol = (("https:" == document.location.protocol) ? " https://" : " http://");
      document.write(unescape("%3Cspan id='cnzz_stat_icon_1264021086'%3E%3C/span%3E%3Cscript src='" + cnzz_protocol + "s22.cnzz.com/z_stat.php%3Fid%3D1264021086%26show%3Dpic1' type='text/javascript'%3E%3C/script%3E"));
  </script> -->
<script src="./plugins/layui/layui.js"></script>
<script>
    var message;
    layui.config({
        base: 'src/js/',
        version: '1.0.1'
    }).use(['app', 'message'], function () {
        var app = layui.app,
            $ = layui.jquery,
            layer = layui.layer;
        //将message设置为全局以便子页面调用
        message = layui.message;
        //主入口
        app.set({
            type: 'iframe'
        }).init();
        $('#pay').on('click', function () {
            layer.open({
                title: false,
                type: 1,
                content: '<img src="/src/images/pay.png" />',
                area: ['500px', '250px'],
                shadeClose: true
            });
        });
        $('dl.skin > dd').on('click', function () {
            var $that = $(this);
            var skin = $that.children('a').data('skin');
            switchSkin(skin);
        });
        var setSkin = function (value) {
                layui.data('kit_skin', {
                    key: 'skin',
                    value: value
                });
            },
            getSkinName = function () {
                return layui.data('kit_skin').skin;
            },
            switchSkin = function (value) {
                var _target = $('link[kit-skin]')[0];
                _target.href = _target.href.substring(0, _target.href.lastIndexOf('/') + 1) + value + _target.href.substring(_target.href.lastIndexOf('.'));
                setSkin(value);

            },
            initSkin = function () {
                var skin = getSkinName();
                switchSkin(skin === undefined ? 'default' : skin);
            }();
    });
</script>
</body>

</html>