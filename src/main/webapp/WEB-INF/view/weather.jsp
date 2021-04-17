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
    <title>Погода в ${weather.name}</title>
    <link rel="stylesheet" href="${pageContext.request.contextPath}/resources/css/nicepage.css" media="screen">
<link rel="stylesheet" href="${pageContext.request.contextPath}/resources/css/weather.css" media="screen">
    <script class="u-script" type="text/javascript" src="${pageContext.request.contextPath}/resources/query/jquery.js" defer=""></script>
    <script class="u-script" type="text/javascript" src="${pageContext.request.contextPath}/resources/query/nicepage.js" defer=""></script>
    <meta name="generator" content="Nicepage 3.11.0, nicepage.com">
    <link id="u-theme-google-font" rel="stylesheet" href="https://fonts.googleapis.com/css?family=Roboto:100,100i,300,300i,400,400i,500,500i,700,700i,900,900i|Open+Sans:300,300i,400,400i,600,600i,700,700i,800,800i">
    
    
    <script type="application/ld+json">{
		"@context": "http://schema.org",
		"@type": "Organization",
		"name": "Site1",
		"url": "index.html",
		"logo": "images/image1.png"
}</script>
    <meta property="og:title" content="weather">
    <meta property="og:type" content="website">
    <meta name="theme-color" content="#478ac9">
    <link rel="canonical" href="${pageContext.request.contextPath}">
    <meta property="og:url" content="index.html">
  </head>
  <body class="u-body u-overlap"><header class="u-border-1 u-border-custom-color-3 u-clearfix u-header u-header" id="sec-b41"><div class="u-clearfix u-sheet u-sheet-1">
        <a href="${pageContext.request.contextPath}" class="u-image u-logo u-image-1" data-image-width="600" data-image-height="200">
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
            <ul class="u-nav u-unstyled u-nav-1"><li class="u-nav-item"><a class="u-button-style u-nav-link u-text-active-white u-text-body-alt-color u-text-hover-palette-1-base" href="${pageContext.request.contextPath}" style="padding: 10px 48px;">Главная</a>
</li><li class="u-nav-item"><a class="u-button-style u-nav-link u-text-active-white u-text-body-alt-color u-text-hover-palette-1-base" style="padding: 10px 48px;">Профиль</a>
</li></ul>
          </div>
          <div class="u-custom-menu u-nav-container-collapse">
            <div class="u-black u-container-style u-inner-container-layout u-opacity u-opacity-95 u-sidenav">
              <div class="u-sidenav-overflow">
                <div class="u-menu-close"></div>
                <ul class="u-align-center u-nav u-popupmenu-items u-unstyled u-nav-2"><li class="u-nav-item"><a class="u-button-style u-nav-link" href="${pageContext.request.contextPath}" style="padding: 10px 48px;">Главная</a>
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
        <div class="u-clearfix u-gutter-0 u-layout-wrap u-layout-wrap-1">
          <div class="u-layout">
            <div class="u-layout-row">
              <div class="u-container-style u-layout-cell u-shape-rectangle u-size-9 u-layout-cell-1">
                <div class="u-container-layout u-container-layout-1"></div>
              </div>
              <div class="u-container-style u-layout-cell u-size-51 u-layout-cell-2">
                <div class="u-container-layout u-valign-top u-container-layout-2">
                  <div class="u-container-style u-group u-group-1">
                    <div class="u-container-layout u-container-layout-3">
                      <h2 class="u-align-center u-text u-text-palette-1-light-2 u-text-1">${weather.name} ${weather.region}</h2>
                      <h3 class="u-align-center u-text u-text-grey-40 u-text-2">${weather.time}</h3>
                      <h4 class="u-align-center u-text u-text-grey-15 u-text-3">Температура&nbsp;${weather.temp}C</h4>
                      <h4 class="u-align-center u-text u-text-grey-15 u-text-4">По ощущениям ${weather.feelsLike}C</h4>
                      <h4 class="u-align-center u-text u-text-grey-15 u-text-5">Влажность ${weather.humidity}%</h4>
                      <h4 class="u-align-center u-text u-text-grey-15 u-text-5">Осадки ${weather.precipitation}mm</h4>
                    </div>
                  </div>
                  <div class="u-container-style u-group u-group-2">
                    <div class="u-container-layout u-container-layout-4">
                      <img src="${pageContext.request.contextPath}/resources/image/imgWeather/${weather.icon}.jpg" alt="" class="u-align-center u-image u-image-round u-radius-31 u-image-1" data-image-width="1280" data-image-height="853">
                      <h4 class="u-align-center u-text u-text-grey-15 u-text-6">${weather.weather} облака:${weather.clouds}%</h4>
                    </div>
                  </div>
                </div>
              </div>
            </div>
          </div>
        </div>
      </div>
    </section>
    
    
    <footer class="u-align-center u-clearfix u-footer u-grey-80 u-footer" id="sec-aed7"><div class="u-clearfix u-sheet u-sheet-1">
        <p class="u-small-text u-text u-text-variant u-text-1">Сайт для просмотра текущей информации по погоде.<br>Все права не защищены :)
        </p>
      </div></footer>
  </body>
</html>