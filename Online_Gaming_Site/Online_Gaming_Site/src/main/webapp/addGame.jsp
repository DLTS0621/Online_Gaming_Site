<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8" %>
<!DOCTYPE html>
<html>
<head>
    <meta charset="UTF-8">
    <title>Add Game</title>
    <link rel="stylesheet" href="style/footer.css">
    <link href="https://cdn.jsdelivr.net/npm/bootstrap@5.0.2/dist/css/bootstrap.min.css" rel="stylesheet" integrity="sha384-EVSTQN3/azprG1Anm3QDgpJLIm9Nao0Yz1ztcQTwFspd3yD65VohhpuuCOmLASjC" crossorigin="anonymous">
</head>
<body id="form-container">
	<div class="container" >
	<div class="row">
	<div class="col-sm" style="padding-top: 400px;">
    <h1>Add a New Game</h1>
    </div>
    <div class="col-sm">
    <img src="img/game.svg" alt="" style="height: 500px; width: 500px;">
    </div>
    </div>
    <hr class="border border-primary border-3 opacity-75">
    <form action="add" method="post">
        <label class="form-label" for="game_name">Game Name:</label><br/>
        <input class="form-control" type="text" id="gameName" name="gameName" placeholder="Enter Game Name" required>
        <br><br>
        
        <label class="form-label" for="game_category">Game Category:</label><br/>
        <input class="form-control" type="text" id="gameCategory" name="gameCategory" placeholder="Enter Game Category" required>
        <br><br>
        
        <label class="form-label" for="file_size">File Size (GB):</label><br/>
        <input class="form-control" type="number" id="fileSize" name="fileSize" placeholder="Enter Game File Size" required step="1">
        <br><br>
        
        <label class="form-label" for="image">Description</label><br/>
        <textarea name="image" id="image" rows="5" class="form-control" placeholder="Enter Description" required></textarea>
        <br><br>
        
        <input class="btn btn-primary" type="submit" name="submit" value="Add Game">
    </form>
    <br/><br/><br/>
    </div>
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