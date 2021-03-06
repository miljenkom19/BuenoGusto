<#-- @ftlvariable name="text" type="String" -->
<#-- @ftlvariable name="link" type="String" -->
<!DOCTYPE html>
<html lang="en">

<head>
  <meta charset="utf-8">
  <meta content="width=device-width, initial-scale=1.0" name="viewport">

  <title>Bueno Gusto</title>
  <!-- Favicons -->
  <link href="img/favicon.png" rel="icon">
  <link href="img/apple-touch-icon.png" rel="apple-touch-icon">

  <!-- Google Fonts -->
  <link href="https://fonts.googleapis.com/css?family=Poppins:300,300i,400,400i,600,600i,700,700i|Satisfy|Comic+Neue:300,300i,400,400i,700,700i" rel="stylesheet">

  <!-- Vendor CSS Files -->
  <link href="vendor/animate/animate.min.css" rel="stylesheet">
  <link href="vendor/bootstrap/css/bootstrap.min.css" rel="stylesheet">
  <link href="vendor/bootstrap-icons/bootstrap-icons.css" rel="stylesheet">
  <link href="vendor/boxicons/css/boxicons.min.css" rel="stylesheet">
  <link href="vendor/glightbox/css/glightbox.min.css" rel="stylesheet">
  <link href="vendor/swiper/swiper-bundle.min.css" rel="stylesheet">

  <!-- Template Main CSS File -->
  <link href="css/style.css" rel="stylesheet">
</head>

<body>

  <!-- ======= Header ======= -->
  <header id="header" class="d-flex align-items-center header-transparent">
    <div class="container-fluid container-xl d-flex align-items-center justify-content-between">

      <div class="logo me-auto">
        <h1><a href="index.ftl">Bueno Gusto</a></h1>
      </div>

      <nav id="navbar" class="navbar order-last order-lg-0">
        <ul>
          <li><a class="nav-link scrollto active" href="#hero">Početna</a></li>
          <li><a class="nav-link scrollto" href="#menu">Jelovnik</a></li>
          <li><a class="nav-link scrollto" href="#projekt">O projektu</a></li>
          <li><a class="nav-link scrollto" href="#contact">Kontakt</a></li>
        </ul>
      </nav><!-- .navbar -->

      <a href="#book-a-table" class="book-a-table-btn scrollto">Rezervacija</a>
      <a href="/${link}" class="login-btn">${text}</a>

    </div> 
  </header><!-- End Header -->

  <!-- ======= Hero Section ======= -->
  <section id="hero">
    <div class="hero-container">
      <div id="heroCarousel" data-bs-interval="5000" class="carousel slide carousel-fade" data-bs-ride="carousel">

        <ol class="carousel-indicators" id="hero-carousel-indicators"></ol>

        <div class="carousel-inner" role="listbox">

          <div class="carousel-item active" style="background: url(img/slide/slide-3.jpg);">
            <div class="carousel-container">
              <div class="carousel-content">
                <h2 class="animate__animated animate__fadeInDown"><span>Bueno</span> Gusto</h2>
                <div>
                  <a href="#menu" class="btn-menu animate__animated animate__fadeInUp scrollto">Jelovnik</a>
                  <a href="#book-a-table" class="btn-book animate__animated animate__fadeInUp scrollto">Rezervacija</a>
                </div>
              </div>
            </div>
          </div>

        </div>

      </div>
    </div>
  </section><!-- End Hero -->

  <main id="main">
    <!-- ======= Menu Section ======= -->
    <section id="menu" class="menu">
      <div class="container">

        <div class="section-title">
          <h2>Pogledajte Naš <span>Jelovnik</span></h2>
        </div>

        <div class="row menu-container">

          <div class="col-lg-6 menu-item">
            <div class="menu-content">
              <a href="#">Goveđi Odrezak</a><span>€15.95</span>
            </div>
          </div>

          <div class="col-lg-6 menu-item">
            <div class="menu-content">
              <a href="#">Svinjski Vrat</a><span>€13.95</span>
            </div>
          </div>

          <div class="col-lg-6 menu-item">
            <div class="menu-content">
              <a href="#">Pileći Fileti</a><span>€10.95</span>
            </div>
          </div>

          <div class="col-lg-6 menu-item">
            <div class="menu-content">
              <a href="#">Cezar Salata</a><span>€7.95</span>
            </div>
          </div>

          <div class="col-lg-6 menu-item">
            <div class="menu-content">
              <a href="#">Salata od Hobotnice</a><span>€9.95</span>
            </div>
          </div>

          <div class="col-lg-6 menu-item">
            <div class="menu-content">
              <a href="#">Grčka Salata</a><span>€5.95</span>
            </div>
          </div>

          <div class="col-lg-6 menu-item">
            <div class="menu-content">
              <a href="#">Pasta Italiana</a><span>€9.95</span>
            </div>
          </div>

          <div class="col-lg-6 menu-item">
            <div class="menu-content">
              <a href="#">Penne Pasta</a><span>€9.95</span>
            </div>
          </div>

          <div class="col-lg-6 menu-item">
            <div class="menu-content">
              <a href="#">Lignje</a><span>€11.95</span>
            </div>
          </div>

          <div class="col-lg-6 menu-item">
            <div class="menu-content">
              <a href="#">Juha od škampa</a><span>€13.95</span>
            </div>
          </div>

          <div class="col-lg-6 menu-item">
            <div class="menu-content">
              <a href="#">Tartar od lososa</a><span>€13.95</span>
            </div>
          </div>

          <div class="col-lg-6 menu-item">
            <div class="menu-content">
              <a href="#">Rakova Poslastica</a><span>€14.95</span>
            </div>
          </div>

          <div class="col-lg-6 menu-item">
            <div class="menu-content">
              <a href="#">Muffini s borovnicama</a><span>€8.95</span>
            </div>
          </div>


          <div class="col-lg-6 menu-item">
            <div class="menu-content">
              <a href="#">Čokoladna torta</a><span>€10.95</span>
            </div>
          </div>

          <div class="col-lg-6 menu-item">
            <div class="menu-content">
              <a href="#">Sezonsko voće</a><span>€7.95</span>
            </div>
          </div>

          <div class="col-lg-6 menu-item">
            <div class="menu-content">
              <a href="#">Sladoled</a><span>€5.95</span>
            </div>
          </div>

          <div class="col-lg-6 menu-item">
            <div class="menu-content">
              <a href="#">Pita od jabuka</a><span>€8.95</span>
            </div>
          </div>

          <div class="col-lg-6 menu-item">
            <div class="menu-content">
              <a href="#">Cheesecake</a><span>€11.95</span>
            </div>
          </div>

        </div>

      </div>
    </section><!-- End Menu Section -->

    <!-- ======= Book A Table Section ======= -->
    <section id="book-a-table" class="book-a-table">
      <div class="container">

        <div class="section-title">
          <h2>Rezervirajte  <span>Mjesto</span></h2>
        </div>

        <form action="/submit" method="post" role="form" class="php-email-form">
          <div class="row">
            <div class="col-lg-4 col-md-6 form-group mt-3 mt-md-0">
              <input type="email" class="form-control" name="email" id="email" placeholder="Email" data-rule="email" data-msg="Please enter a valid email">
              <div class="validate"></div>
            </div>
            <div class="col-lg-4 col-md-6 form-group mt-3 mt-md-0">
              <input type="text" class="form-control" name="phone" id="phone" placeholder="Telefon" data-rule="minlen:4" data-msg="Please enter at least 4 chars">
              <div class="validate"></div>
            </div>
            <div class="col-lg-4 col-md-6 form-group mt-3">
              <input type="datetime-local" name="dateTime" class="form-control" id="dateTime" placeholder="Datum & Vrijeme" data-rule="minlen:4" data-msg="Please enter at least 4 chars">
              <div class="validate"></div>
            </div>
            <div class="col-lg-4 col-md-6 form-group mt-3">
              <input type="number" class="form-control" name="noOfPeople" id="people" placeholder="Broj ljudi" data-rule="minlen:1" data-msg="Please enter at least 1 chars">
              <div class="validate"></div>
            </div>
          </div>
          <div class="form-group mt-3">
            <textarea class="form-control" name="message" rows="5" placeholder="Poruka"></textarea>
          </div>
          <div class="text-center"><button type="submit">Rezervacija</button></div>
        </form>

      </div>
    </section><!-- End Book A Table Section -->

    
    <!-- ======= Chefs Section ======= -->
    <section id="projekt" class="projekt">
      <div class="container">

        <div class="row">

          <div class="col-lg-4">
            <div class="member">
              <div class="pic"><img src="img/projekt/jelena.jpg" class="img-fluid" alt=""></div>
              <div class="member-info">
                <h4>Jelena Petrušić</h4>
                <span>Mostar</span>
                <span>21 godina</span>
                <span>3. godina računarstva</span>
              </div>
            </div>
          </div>

          <div class="col-lg-4">
            <div class="member">
              <div class="pic"><img src="img/tehnologije.png" class="img-fluid" alt=""></div>
            </div>
          </div>

          <div class="col-lg-4">
            <div class="member">
              <div class="pic"><img src="img/projekt/miljenko.jpg" class="img-fluid" alt=""></div>
              <div class="member-info">
                <h4>Miljenko Marković</h4>
                <span>Stolac</span>
                <span>21 godina</span>
                <span>3. godina računarstva</span>
              </div>
            </div>
          </div>

          <div class="col-lg-2"></div>

          <div class="col-lg-8">
            <div class="member">
              <div class="pic"><img src="img/projekt/diagram.png" class="img-fluid" alt=""></div>
              <div class="member-info">
                <span>Vizija: <a href="#">link</a></span>
              </div>
            </div>
          </div>

          <div class="col-lg-2"></div>

        </div>

      </div>
    </section><!-- End Chefs Section -->

    <!-- ======= Contact Section ======= -->
    <section id="contact" class="contact">
      <div class="container">

        <div class="section-title">
          <h2><span>Kontaktirajte</span> Nas</h2>
        </div>
      </div>

      <div class="container mt-5">

        <div class="info-wrap">
          <div class="row">
            <div class="col-lg-3 col-md-6 info">
              <i class="bi bi-geo-alt"></i>
              <h4>Lokacija:</h4>
              <p>Matice hrvatske b.b.<br>Mostar, 88000</p>
            </div>

            <div class="col-lg-3 col-md-6 info mt-4 mt-lg-0">
              <i class="bi bi-clock"></i>
              <h4>Radno vrijeme:</h4>
              <p>Ponedjeljak-Nedjeljak:<br>11:00 AM - 23:00 PM</p>
            </div>

            <div class="col-lg-3 col-md-6 info mt-4 mt-lg-0">
              <i class="bi bi-envelope"></i>
              <h4>Email:</h4>
              <p>buenogusto@gmail.com</p>
            </div>

            <div class="col-lg-3 col-md-6 info mt-4 mt-lg-0">
              <i class="bi bi-phone"></i>
              <h4>Telefon:</h4>
              <p>+38763 123 456<br>+38763 456 789</p>
            </div>
          </div>
        </div>
      </div>
    </section><!-- End Contact Section -->

  </main><!-- End #main -->

  <!-- ======= Footer ======= -->
  <footer id="footer">
    <div class="container">
      <h3>Bueno Gusto</h3>
      <div class="copyright">
        &copy; Copyright <strong><span>Bueno Gusto</span></strong>. All Rights Reserved
      </div>
    </div>
  </footer><!-- End Footer -->

  <a href="#" class="back-to-top d-flex align-items-center justify-content-center"><i class="bi bi-arrow-up-short"></i></a>

  <!-- Vendor JS Files -->
  <script src="vendor/bootstrap/js/bootstrap.bundle.min.js"></script>
  <script src="vendor/glightbox/js/glightbox.min.js"></script>
  <script src="vendor/isotope-layout/isotope.pkgd.min.js"></script>
  <script src="vendor/swiper/swiper-bundle.min.js"></script>

  <!-- Template Main JS File -->
  <script src="js/main.js"></script>

</body>

</html>