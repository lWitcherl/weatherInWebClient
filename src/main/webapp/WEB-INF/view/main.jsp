<%--<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>--%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ taglib prefix="spring" uri="http://www.springframework.org/tags" %>

<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<!DOCTYPE html>
<html style="font-size: 16px;">
<head>
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <meta charset="utf-8">
    <meta name="keywords" content="INTUITIVE">
    <meta name="description" content="">
    <meta name="page_type" content="np-template-header-footer-from-plugin">
    <title>main</title>
    <spring:url value="/resources/css/nicepage.css" var="nicepage"/>
    <spring:url value="/resources/css/main.css" var="main"/>
    <spring:url value="/resources/query/jquery.js" var="jq"/>
    <spring:url value="/resources/query/nicepage.js" var="njs"/>
    <link href="${nicepage}" rel="stylesheet" />
    <link href="${main}" rel="stylesheet" />
    <script class="u-script" type="text/javascript" src="${jq}" defer=""></script>
    <script class="u-script" type="text/javascript" src="${njs}" defer=""></script>
    <meta name="generator" content="Nicepage 3.11.0, nicepage.com">
    <link id="u-theme-google-font" rel="stylesheet" href="https://fonts.googleapis.com/css?family=Roboto:100,100i,300,300i,400,400i,500,500i,700,700i,900,900i|Open+Sans:300,300i,400,400i,600,600i,700,700i,800,800i">


    <script type="application/ld+json">{
        "@context": "http://schema.org",
        "@type": "Organization",
        "name": "Site1",
        "url": "index.html",
        "logo": "images/image1.png"
    }</script>
    <meta property="og:title" content="main">
    <meta property="og:type" content="website">
    <meta name="theme-color" content="#478ac9">
    <link rel="canonical" href="index.html">
    <meta property="og:url" content="index.html">
</head>
<body class="u-body u-overlap"><header class="u-border-1 u-border-custom-color-3 u-clearfix u-header u-header" id="sec-b41"><div class="u-clearfix u-sheet u-sheet-1">
    <a href="https://nicepage.com" class="u-image u-logo u-image-1" data-image-width="600" data-image-height="200">
        <img src="${pageContext.request.contextPath}/resources/image/image1.png" class="u-logo-image u-logo-image-1" data-image-width="184">
    </a>
    <nav class="u-menu u-menu-dropdown u-offcanvas u-menu-1">
        <div class="menu-collapse" style="font-size: 1rem; letter-spacing: 0px;">
            <a class="u-button-style u-custom-left-right-menu-spacing u-custom-padding-bottom u-custom-text-active-color u-custom-text-color u-custom-text-hover-color u-custom-top-bottom-menu-spacing u-nav-link u-text-active-palette-1-base u-text-body-alt-color u-text-hover-palette-2-base" href="#">
                <svg><use xmlns:xlink="http://www.w3.org/1999/xlink" xlink:href="#menu-hamburger"></use></svg>
                <svg version="1.1" xmlns="http://www.w3.org/2000/svg" xmlns:xlink="http://www.w3.org/1999/xlink"><defs><symbol id="menu-hamburger" viewBox="0 0 16 16" style="width: 16px; height: 16px;"><rect y="1" width="16" height="2"></rect><rect y="7" width="16" height="2"></rect><rect y="13" width="16" height="2"></rect>
                </symbol>
                </defs></svg>
            </a>
        </div>
        <div class="u-custom-menu u-nav-container">
            <ul class="u-nav u-unstyled u-nav-1"><li class="u-nav-item"><a class="u-button-style u-nav-link u-text-active-white u-text-body-alt-color u-text-hover-palette-1-base" href="main.html" style="padding: 10px 48px;">Главная</a>
            </li><li class="u-nav-item"><a class="u-button-style u-nav-link u-text-active-white u-text-body-alt-color u-text-hover-palette-1-base" style="padding: 10px 48px;">Профиль</a>
            </li></ul>
        </div>
        <div class="u-custom-menu u-nav-container-collapse">
            <div class="u-black u-container-style u-inner-container-layout u-opacity u-opacity-95 u-sidenav">
                <div class="u-sidenav-overflow">
                    <div class="u-menu-close"></div>
                    <ul class="u-align-center u-nav u-popupmenu-items u-unstyled u-nav-2"><li class="u-nav-item"><a class="u-button-style u-nav-link" href="main.html" style="padding: 10px 48px;">Главная</a>
                    </li><li class="u-nav-item"><a class="u-button-style u-nav-link" style="padding: 10px 48px;">Профиль</a>
                    </li></ul>
                </div>
            </div>
            <div class="u-black u-menu-overlay u-opacity u-opacity-70"></div>
        </div>
    </nav>
</div></header>
<section class="u-align-left u-clearfix u-image u-section-1" id="sec-f06b" data-image-width="1600" data-image-height="1067">
    <div class="u-clearfix u-sheet u-sheet-1">
        <div class="u-form u-form-1">
            <form action="search" method="GET" class="u-clearfix u-form-custom-backend u-form-horizontal u-form-spacing-10 u-inner-form" style="padding: 10px" source="custom" name="form" redirect="true">
                <div class="u-form-group u-form-group-1">
                    <label for="email-2555" class="u-form-control-hidden u-label u-label-1"></label>
                    <input type="text" placeholder="Введите название города" id="email-2555" name="city" class="u-border-1 u-border-white u-custom-color-3 u-input u-input-rectangle u-radius-50" required="required">
                </div>
                <div class="u-align-left u-form-group u-form-submit">
                    <a href="#" class="u-btn u-btn-submit u-button-style u-none u-text-white u-btn-1">
                        <svg class="u-svg-content" viewBox="0 0 52.966 52.966" x="0px" y="0px" style="width: 1em; height: 1em;"><path d="M51.704,51.273L36.845,35.82c3.79-3.801,6.138-9.041,6.138-14.82c0-11.58-9.42-21-21-21s-21,9.42-21,21s9.42,21,21,21
	c5.083,0,9.748-1.817,13.384-4.832l14.895,15.491c0.196,0.205,0.458,0.307,0.721,0.307c0.25,0,0.499-0.093,0.693-0.279
	C52.074,52.304,52.086,51.671,51.704,51.273z M21.983,40c-10.477,0-19-8.523-19-19s8.523-19,19-19s19,8.523,19,19
	S32.459,40,21.983,40z"></path></svg>
                        <img>
                    </a>
                    <input type="submit" value="submit" class="u-form-control-hidden">
                </div>
                <%--<div class="u-form-send-message u-form-send-success"> Thank you! Your message has been sent. </div>
                <div class="u-form-send-error u-form-send-message"> Unable to send your message. Please fix errors then try again. </div>
                <input type="hidden" value="" name="recaptchaResponse">--%>
            </form>
        </div>
    </div>
</section>


<footer class="u-align-center u-clearfix u-footer u-grey-80 u-footer" id="sec-aed7"><div class="u-clearfix u-sheet u-sheet-1">
    <p class="u-small-text u-text u-text-variant u-text-1">Сайт для просмотра текущей информации по погоде.<br>Все права не защищены :)
    </p>
</div></footer>
</body>
</html>