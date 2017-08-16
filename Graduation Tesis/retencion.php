<?php
	$anml=rand(1, 15);
	session_start();
	$_SESSION['animal'] = $anml;
?>

<!doctype html>
<html>
<head>
<meta charset="utf-8">
<meta http-equiv="refresh" content="10;url=retresp1.php">
<link rel="stylesheet" href="css/style.css" type="text/css">
<title>Juegos Retención</title>
</head>
	<div id="header">
		<div>
			<div id="logo">
				<a href="index.html"><img src="images/logo.png" width="1000" height="130" alt="LOGO"></a>
			</div>
		</div>
	</div>
<body>
<div id="instruccion">
<h1>¡Espéra!, Reconoce a este Animal, tienes <span id="countdown">10</span> segundos</h1>
</div>
		<div id="forma">
				<img src="images/retencion/<?php echo $anml;?>.png" width="300" height="300">
		</div>

</body>
</html>

<script type="text/javascript">

(function () {
    var timeLeft = 10,
        cinterval;

    var timeDec = function (){
        timeLeft--;
        document.getElementById('countdown').innerHTML = timeLeft;
        if(timeLeft === 0){
            clearInterval(cinterval);
        }
    };

    cinterval = setInterval(timeDec, 1000);
})();

</script>