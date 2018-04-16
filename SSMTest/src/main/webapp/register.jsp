<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ page import="java.util.*" %>
<%
    String path = request.getContextPath();
    String basePath = request.getScheme()+"://"+request.getServerName()+":"+request.getServerPort()+path+"/";
    out.print(basePath);
%>
<!DOCTYPE HTML>
<html>
        <head>
                <meta charset="utf-8" />
                <title>注册帐号 | 轻笔记</title>
                <meta name="keywords" content="thinkernore,行客记事,行客诺,记事本,笔记" />
                <meta name="description" content="一款完全免费的记事本软件，方便你随时随地记录形式各样的资料，支持多种格式的附件" />
                <meta http-equiv="X-UA-Compatible" content="IE=edge" />
                <link rel="shortcut icon" href="<%=basePath%>images/favicon.ico" />
                <link rel="stylesheet" type="text/css" href="<%=basePath%>css/css_v1/public.css" />
                <link rel="stylesheet" type="text/css" href="<%=basePath%>css/css_v1/register.css" />
                <link rel="stylesheet" type="text/css" href="<%=basePath%>css/pub/jquery-ui.css" />
                <script src="<%=basePath%>js/pub/jquery.js"></script>
                <script src="<%=basePath%>js/pub/jquery-ui.js"></script>
                <script src="<%=basePath%>js/pub/jquery.cookie.js"></script>
                <script src="<%=basePath%>js/register.plain.js"></script>
                <script src="<%=basePath%>js/TNoteWeb.plain.js"></script>
                <script src="<%=basePath%>js/headLogin.plain.js"></script>
        </head>
        <body>
                <!-- Google Code for &#27880;&#20876;&#39029;&#38754;&#36716;&#25442;&#36319;&#36394; Conversion Page -->
                <script type="text/javascript">
                        /* <![CDATA[ */
                var google_conversion_id = 950119504;
                var google_conversion_language = "en";
                var google_conversion_format = "2";
                var google_conversion_color = "ffffff";
                var google_conversion_label = "3JLcCKiQtwQQ0NiGxQM";
                var google_conversion_value = 0;
                /* ]]> */
        </script>
        <!--script type="text/javascript" src="http://www.googleadservices.com/pagead/conversion.js"-->
        </script>
        <noscript>
                <div style="display:inline;">
                        <img height="1" width="1" style="border-style:none;" alt="" src="http://www.googleadservices.com/pagead/conversion/950119504/?value=0&amp;label=3JLcCKiQtwQQ0NiGxQM&amp;guid=ON&amp;script=0"/>
                </div>
        </noscript>

                <script>
                        if(navigator.appName == "Microsoft Internet Explorer") {
                                var vs=navigator.appVersion.split(";")[1].replace(/[ ]/g, "");
                                if(vs== "MSIE6.0" ) {
                                //      window.location = "<%=basePath%>ie.html";
                                }
                        }
                        jQuery(document).ready(function(){
                                TN.placeholderInit();
                        });
                </script>
                <input type="hidden" id="subAction" name="subAction" value="/register">
                <input type="hidden" id="next" name="next" value="">

                <div class="mainHeader down-shadow mainHeaderColor">
                        <div class="headerContent px940 center">
                                <div class="logo"></div>
                                <ul class="nav">
                                    <li><span><a class="" href="/">首页</a></span></li>
                                    <li><span><a class="" href="/product">产品介绍</a></span></li>
                                    <li><span><a class="" href="/download">下载软件</a></span></li>
                                    <li><span><a class="" href="/open">开放平台</a></span></li>
                                    <li><span><a class="" href="/help">帮助中心</a></span></li>
                                    <li><span><a class="" href="/news">新闻动态</a></span></li>
                                    <li><span><a class="" href="/feedback">意见反馈</a></span></li>
                                </ul>
                        </div>
                </div>


                <div id="content" class="content in-shadow_3px" >
                        <div class="contentBox px940 center">
                                <div class="main center down-shadow1">
                                        <div class="titleBar1 imgTitle">
                                                <a>一个账号,多设备共享,永久免费!</a>
                                        </div>
                                        <form class="center" id="form1" name="form1" action="/lightnote/user/register" onsubmit="return check_form()">

                                                <ul class="usage">
                                                        <li><label id="registerInfo"></label></li>
                                                        <li><span>用户名</span><input type="text" id="username" name="username" class="ipt field" maxlength="50"/><label></label></li>
                                                        <li><span>注册邮箱</span><input type="text" id="email" name="email" class="ipt field" maxlength="50"/><label></label></li>
                                                        <li><span>用户密码</span><input type="password" id="password" name="password" class="ipt field" /><label></label></li>
                                                        <li><span>确认密码</span><input type="password" id="password2" name="password2" class="ipt field "/><label></label></li>
                                                        <li><span >提示信息</span>
                                                       
                                                        </li>
                                                        <li id="tipmsg"></li>
                                                        <li >
                                                                <div align="right">
                                                                       <!--a <a href="javascript:document.getElementById('form1').submit();">立即注册</a>-->
                                                                        <input type="submit" id="btn_register" value="立即注册" class="no_under">
                                                                </div>
                                                            
                                                        </li>
                                                </ul>
                                        </form>
                                </div>
                        </div>
                </div>

                <div id="footer" class="footer in-shadow_3px">
                        <div class="footerContent px940 center">
                                <div class="top">
                                        <div class="left">
                                                <a target="_blank" title="关注我们">关注我们</a>
                                                <a href="http://t.qq.com/qingbiji-note"><img src="<%=basePath%>images/newNote_v1/qq.png" /></a>
                                                <a href="http://e.weibo.com/qingbiji"><img src="<%=basePath%>images/newNote_v1/weibo.png" /></a>
                                                <a target="_blank" href="/contact" title="联系我们">联系我们</a>
                                        </div>
                                        <div class="mid">
                                                <a>友情链接 : </a>
                                                <a target="_blank" title="财智理财软件 " href="http://moneywise.com.cn/ ">财智理财软件  </a>
                                                <a target="_blank" title="CopyTo官网 " href="http://www.copyto.cn/">CopyTo官网</a>
                                                <a target="_blank" title="中关村在线" href=" http://sj.zol.com.cn">ZOL</a>
                                                <a target="_blank" title="小米应用商店" href=" http://app.xiaomi.com">小米应用商店</a>
                                                <a href="http://www.wetuandui.com" style="display:none;">wetuandui</a>
                                        </div>
                                        <div class="right">
                                                <span>推荐使用 : </span>
                                                <a target="_blank" href="http://chrome.360.cn/"><img src="<%=basePath%>images/index/new/16-16-icon.png">360极速浏览器</a>
                                        </div>
                                </div>
                                <div class="line center"></div>
                                <div class="bottom center">
                                        Copyright @2012 行客诺（北京）科技有限公司 京ICP备11030702号<br/><br/>
                                        <!--<a href="http://trust.360.cn/search.php" target="_blank" title="360绿色网站"><img src="http://trust.360.cn/img.php?sn=2686&id=3" border="0" width="75px"/></a>-->
                                </div>
                        </div>
                </div>
                

                
</body>
</html>
