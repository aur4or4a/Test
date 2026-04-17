<!DOCTYPE html>
<html>
<head>
<title>Display Form Data</title>
</head>
<body>
<h2>Submitted Data</h2>
<?php
if ($_SERVER["REQUEST_METHOD"] == "POST") {
$name = $_POST['name'];
$email = $_POST['email'];
$course = $_POST['course'];
echo "Name: " . $name . "<br>";
echo "Email: " . $email . "<br>";
echo "Course: " . $course . "<br>";
}
?>
</body>
</html>
