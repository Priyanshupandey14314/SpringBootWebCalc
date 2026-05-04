<%@page language = "java"%>
<!DOCTYPE html>
<html>
<head>
    <title>Add Two Numbers</title>

    <style>
        body {
            font-family: Arial, sans-serif;
            background: linear-gradient(to right, #4facfe, #00f2fe);
            height: 100vh;
            display: flex;
            justify-content: center;
            align-items: center;
        }

        .container {
            background: white;
            padding: 30px;
            border-radius: 10px;
            box-shadow: 0 10px 25px rgba(0,0,0,0.2);
            width: 300px;
            text-align: center;
        }

        h2 {
            margin-bottom: 20px;
        }

        input {
            width: 90%;
            padding: 10px;
            margin: 10px 0;
            border: 1px solid #ccc;
            border-radius: 5px;
            font-size: 16px;
        }

        input:focus {
            border-color: #4facfe;
            outline: none;
        }

        button {
            width: 100%;
            padding: 10px;
            background: #4facfe;
            border: none;
            color: white;
            font-size: 16px;
            border-radius: 5px;
            cursor: pointer;
            transition: 0.3s;
        }

        button:hover {
            background: #007bff;
        }

        #result {
            margin-top: 15px;
            font-weight: bold;
            color: #333;
        }
    </style>

</head>
<body>

    <div class="container">
        <h2>Add Two Numbers</h2>

        <form action="add" method="post">
            <input type="number" name="num1" placeholder="Enter first number" required>
            <input type="number" name="num2" placeholder="Enter second number" required>
            <input type="submit" value="add"/>
        </form>

        <div id="result"></div>
    </div>

</body>
</html>