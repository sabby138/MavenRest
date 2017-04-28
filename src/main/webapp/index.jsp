<html>
<head>
<script src="https://ajax.googleapis.com/ajax/libs/jquery/3.2.0/jquery.min.js"></script>
<script type="text/javascript">

    /*function load(){
    window.location.href = "localhost:8080/studyApp/webapi/javaQnA/";
    }*/
    $(document).ready(function(){
            
            $.ajax({
                url: "http://1.255.255.205:8080/studyApp/webapi/javaQnA/",
                type: 'GET',
                success: function(data) {
                	alert('123 '+data);

                },
                error:function(data) {
                  alert("ERROR: "+data.statusText);
                }
          });
        
    });
    </script>
</head>
<body >
	<h1>Hello World!</h1>
</body>
</html>
