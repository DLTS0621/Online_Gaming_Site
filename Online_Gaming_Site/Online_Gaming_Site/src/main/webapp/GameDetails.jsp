<%@ page language="java" contentType="text/html; charset=ISO-8859-1" pageEncoding="ISO-8859-1" %>
    <!DOCTYPE html>
    <html>

    <head>
        <link href="https://cdn.jsdelivr.net/npm/bootstrap@5.0.2/dist/css/bootstrap.min.css" rel="stylesheet"
            integrity="sha384-EVSTQN3/azprG1Anm3QDgpJLIm9Nao0Yz1ztcQTwFspd3yD65VohhpuuCOmLASjC" crossorigin="anonymous">
        <title>Game Details</title>
        <link rel="stylesheet" href="style/footer.css">
    </head>

    <body>
        <div class="container" >
            <div class="row">
                <div class="col-sm" style="padding-top: 400px;">
                    <h1>Game Details Dashboard</h1>
                </div>
                <div class="col-sm">
                    <img src="img/game2.svg" alt="" style="height: 500px; width: 500px;">
                </div>
            </div>
            <hr class="border border-primary border-3 opacity-75">
            <div class="d-grid gap-2 col-6 mx-auto" style="padding-top: 70px;">
                <form action="fetchData" method="post">
                    <input class="form-control btn btn-primary btn-lg" type="submit" value="Get All Details">
                </form>
                <br />
                <a href="addGame.jsp"><button class="form-control btn btn-primary btn-lg">Add Game</button></a>
            </div>
        </div>
        <br/><br/><br/>
        <!-- Footer -->
    <footer class="bg-dark text-light p-5">
        <div class="container">
            <div class="row">
                <div class="col-md-6">
                    <h2>Connect with Us</h2>
                    <p>Join the gaming community and stay updated:</p>
                    <ul class="list-unstyled">
                        <li><a href="#"><i class="fab fa-facebook"></i> Facebook</a></li>
                        <li><a href="#"><i class="fab fa-twitter"></i> Twitter</a></li>
                        <li><a href="#"><i class="fab fa-instagram"></i> Instagram</a></li>
                    </ul>
                </div>
                <div class="col-md-6 text-end">
                    <h2>Quick Links</h2>
                    <ul class="list-unstyled">
                        <li><a href="#">Home</a></li>
                        <li><a href="#">Games</a></li>
                        <li><a href="#">About Us</a></li>
                        <li><a href="#">Contact</a></li>
                    </ul>
                </div>
            </div>
        </div>
    </footer>
    </body>

    </html>