<!DOCTYPE html>
<html>
<head>
<style>
table {
    width: 100%;
    border-collapse: collapse;
}

table, td, th {
    border: 1px solid black;
    padding: 5px;
}

th {text-align: left;}
</style>
</head>
<body>

<?php
$q = $_GET['q'];

$con = mysqli_connect('localhost','root','','news');
if (!$con) {
    die('Could not connect: ' . mysqli_error($con));
}

mysqli_select_db($con,"my_db");
$sql="SELECT * FROM articles WHERE headlines LIKE '%".$q."%'";
$result = mysqli_query($con,$sql);

echo "
<table>
<tr>
<th>Author</th>
<th>Date</th>
<th>Headlines</th>
<th>Article</th>
</tr>";
while($row = mysqli_fetch_array($result)) {
    echo "<tr>";
    echo "<td>" . $row['author'] . "</td>";
    echo "<td>" . $row['date'] . "</td>";
    echo "<td>" . $row['headlines'] . "</td>";
    echo "<td>" . $row['text'] . "</td>";
    echo "</tr>";

}
echo "</table>";
mysqli_close($con);
?>
</body>
</html>
