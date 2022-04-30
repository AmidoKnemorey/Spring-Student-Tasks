<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/fmt" prefix="fmt" %>
<jsp:useBean id="now" class="java.util.Date"/>
<%@ page contentType="text/html; charset=UTF-8" %>
<%@include file="../dynamic/css.jspf" %>

<!DOCTYPE html>
<html lang="pl">

<head>

    <meta charset="utf-8">
    <meta http-equiv="X-UA-Compatible" content="IE=edge">
    <meta name="viewport" content="width=device-width, initial-scale=1, shrink-to-fit=no">
    <meta name="description" content="">
    <meta name="author" content="">

    <title>JAVARZ</title>

    <!-- Custom fonts for this template-->
    <link href="vendor/fontawesome-free/css/all.min.css" rel="stylesheet" type="text/css">
    <link href="https://fonts.googleapis.com/css?family=Nunito:200,200i,300,300i,400,400i,600,600i,700,700i,800,800i,900,900i"
          rel="stylesheet">

    <!-- Custom styles for this template-->
    <link href="css/sb-admin-2.min.css" rel="stylesheet">

</head>

<body id="page-top">

<!-- Page Wrapper -->
<div id="wrapper">

    <%@include file="../dynamic/navigationMain.jspf" %>

    <!-- Content Wrapper -->
    <div id="content-wrapper" class="d-flex flex-column">

        <!-- Main Content -->
        <div id="content">

            <!-- Topbar -->
            <nav class="navbar navbar-expand navbar-light bg-white topbar mb-4 static-top shadow">

                <!-- Sidebar Toggle (Topbar) -->
                <button id="sidebarToggleTop" class="btn btn-link d-md-none rounded-circle mr-3">
                    <i class="fa fa-bars"></i>
                </button>


                <!-- Topbar Navbar -->
                <ul class="navbar-nav ml-auto">

                    <!-- Nav Item - Search Dropdown (Visible Only XS) -->
                    <li class="nav-item dropdown no-arrow d-sm-none">
                        <a class="nav-link dropdown-toggle" href="#" id="searchDropdown" role="button"
                           data-toggle="dropdown" aria-haspopup="true" aria-expanded="false">
                            <i class="fas fa-search fa-fw"></i>
                        </a>
                        <!-- Dropdown - Messages -->
                        <div class="dropdown-menu dropdown-menu-right p-3 shadow animated--grow-in"
                             aria-labelledby="searchDropdown">
                            <form class="form-inline mr-auto w-100 navbar-search">
                                <div class="input-group">
                                    <input type="text" class="form-control bg-light border-0 small"
                                           placeholder="Search for..." aria-label="Search"
                                           aria-describedby="basic-addon2">
                                    <div class="input-group-append">
                                        <button class="btn btn-primary" type="button">
                                            <i class="fas fa-search fa-sm"></i>
                                        </button>
                                    </div>
                                </div>
                            </form>
                        </div>
                    </li>


                    <div class="topbar-divider d-none d-sm-block"></div>

                    <!-- Nav Item - User Information -->
                    <li class="nav-item dropdown no-arrow">
                        <a class="nav-link dropdown-toggle" href="#" id="userDropdown" role="button"
                           data-toggle="dropdown" aria-haspopup="true" aria-expanded="false">
                            <span class="mr-2 d-none d-lg-inline text-gray-600 small">Imię nazwisko</span>

                        </a>
                        <!-- Dropdown - User Information -->
                        <div class="dropdown-menu dropdown-menu-right shadow animated--grow-in"
                             aria-labelledby="userDropdown">
                            <a class="dropdown-item" href="#">
                                <i class="fas fa-user fa-sm fa-fw mr-2 text-gray-400"></i>
                                Profile
                            </a>
                            <div class="dropdown-divider"></div>
                            <a class="dropdown-item" href="#" data-toggle="modal" data-target="#logoutModal">
                                <i class="fas fa-sign-out-alt fa-sm fa-fw mr-2 text-gray-400"></i>
                                Logout
                            </a>
                        </div>
                    </li>

                </ul>

            </nav>
            <!-- End of Topbar -->

<%--            ============================================================================================--%>

            <form method="post" action='<c:url value="/addTask"/>'>

                <!-- Begin Page Content -->
                <div class="container-fluid">

                    <!-- Content Row -->
                    <div class="row">
                        <div class="col-xl-12 col-md-12 mb-12">
                            <div class="card shadow mb-4">
                                <div class="card-header py-3">


                                    <div class="form-group row">
                                        <label for="id" class="col-2 col-form-label">Wybierz kursanta</label>
                                        <div class="col-10">
                                            <select class="form-control" type="text" name="id">
                                                <option hidden>wybierz</option>

                                                    <c:forEach items="${student}" var="each">
                                                        <option>
                                                            <td> ${each.firstName} </td>
                                                            <td> ${each.lastName} </td>
                                                        </option>
                                                    </c:forEach>
                                            </select>
                                        </div>
                                    </div>


                                    <div class="form-group row">
                                        <label for="deadline" class="col-2 col-form-label">Deadline</label>
                                        <div class="col-10">
                                            <input class="form-control" type="date" placeholder="deadline" name="deadline">
                                        </div>
                                    </div>


                                    <div class="form-group row">
                                        <label for="description" class="col-2 col-form-label">Tresć zadania:</label>
                                        <div class="col-10">
                                            <textarea class="form-control" rows="5" id="start"
                                                      placeholder="tutaj opisz zadanie..." name="description"></textarea>
                                        </div>
                                    </div>


                                </div>
                            </div>
                        </div>
                    </div>


                    <div class="card shadow mb-4">
                        <div class="card-header py-3">


                            <div class="form-group row">
                                <div class="col-12">


                                    <div class="col-md-10">
                                        <div class="row">

    <%--                                        <div class="col-sm-2">--%>
    <%--                                            <label class="form-check-label" for="button1">--%>
    <%--                                                <input class="form-check-input" type="radio" name="changebleButton" id="button1">--%>
    <%--                                                <i class="btn btn-success btn-circle btn-sm"></i> Poziom junior--%>
    <%--                                            </label>--%>
    <%--                                        </div>--%>

    <%--                                        <div class="col-sm-2">--%>
    <%--                                            <label class="form-check-label" for="button2">--%>
    <%--                                                <input class="form-check-input" type="radio" name="changebleButton" id="button2">--%>
    <%--                                                <i class="btn btn-info btn-circle btn-sm"></i>Poziom junior+--%>
    <%--                                            </label>--%>
    <%--                                        </div>--%>


    <%--                                        <div class="col-sm-2">--%>
    <%--                                            <label class="firm-check-label" for="button3">--%>
    <%--                                                <input class="form-check-input" type="radio" name="changebleButton" id="button3">--%>
    <%--                                                <i class="btn btn-secondary btn-circle btn-sm"></i>Poziom mid--%>
    <%--                                            </label>--%>
    <%--                                        </div>--%>


    <%--                                        <div class="col-sm-2">--%>
    <%--                                            <label class="form-check-label" for="button4">--%>
    <%--                                                <input class="form-check-input" type="radio" name="changebleButton" id="button4">--%>
    <%--                                                <i class="btn btn-primary btn-circle btn-sm"></i>Poziom mid +--%>
    <%--                                            </label>--%>
    <%--                                        </div>--%>


    <%--                                        <div class="col-sm-2">--%>
    <%--                                            <label class="form-check-label" for="button5">--%>
    <%--                                                <input class="form-check-input" type="radio" name="changebleButton" id="button5">--%>
    <%--                                                <i class="btn btn-danger btn-circle btn-sm"></i>Poziom senior--%>
    <%--                                            </label>--%>
    <%--                                        </div>--%>


                                        </div>
                                    </div>

                                </div>
                            </div>

                        </div>
                    </div>


                    <input class="btn btn-success pull-left" type="submit" value="Wyślij" id="searchButton"/>
                </div>
            </form>
            <!-- /.container-fluid -->

        </div>
        <!-- End of Main Content -->

        <%@include file="../dynamic/board.jspf" %>>

        <%@include file="../dynamic/JavaScript.jspf" %>>

</body>

</html>
