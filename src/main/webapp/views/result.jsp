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
        <%-- <div id="result">Result is :${result}</div> --%>
        <h2>Welcome to Page </h2>
        <p> ${alien} </p>
        <p>Welcome to ${course} World.</p>
    </div>
</body>
</html>