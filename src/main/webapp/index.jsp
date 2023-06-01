<!DOCTYPE html>
<html>
<head>
    <title>TPO4</title>

    <style>
        h1 {
            font-size: 36px;
            text-align: center;
            color: #333;
            margin-top: 50px;
        }

        form {
            width: 50%;
            margin: 50px auto;
            padding: 20px;
            border: 2px solid #333;
            border-radius: 10px;
            box-shadow: 0 0 10px rgba(0, 0, 0, 0.2);
        }

        label {
            display: block;
            margin-bottom: 10px;
            font-size: 18px;
            color: #333;
        }

        select {
            width: 100%;
            padding: 10px;
            font-size: 16px;
            border: 2px solid #ccc;
            border-radius: 5px;
            background-color: #f8f8f8;
            appearance: none;
            -webkit-appearance: none;
            -moz-appearance: none;
        }

        input[type="submit"] {
            display: block;
            margin-top: 20px;
            padding: 10px 20px;
            font-size: 18px;
            color: #fff;
            background-color: #333;
            border: none;
            border-radius: 5px;
            cursor: pointer;
            transition: background-color 0.3s ease;
        }

        input[type="submit"]:hover {
            background-color: #555;
        }

    </style>
</head>
<body>
<h1>Aleksander Siemiatkowski s22201</h1>
<form action="RequestServlet" method="post">
    <label for="carCategory">Wybierz kategorie samochodu:</label>
    <select name="carCategory" id="carCategory">
        <option value="CIEZAROWY">CIEZAROWY</option>
        <option value="F1">F1</option>
        <option value="OSOBOWY">OSOBOWY</option>
        <option value="DOSTAWCZY">DOSTAWCZY</option>
    </select>
    <input type="submit" value="Szukaj">
</form>
</body>
</html>
