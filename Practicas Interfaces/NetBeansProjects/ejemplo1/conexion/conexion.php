<?php

$servername = "localhost:3306";
$username = "root";
$password = "aula1";
$database = "sakila";

// Create connection
$conn = new mysqli($servername, $username, $password, $database);

// Check connection
if ($conn->connect_error) {
  die("Connection failed: " . $conn->connect_error);
}
echo "Connected successfully";