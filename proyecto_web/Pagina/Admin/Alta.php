<html>
    <head>
    <title>Tu Orden</title>
    </head>
    <body>
    <div class="Especialidades2">
    <?php
        $bd_host = "127.0.0.1";
        
        $bd_user = "root";
        
        $bd_pass = "";
        
        $bd_name = "itacos";
        
        $Nombre=$_POST['name'];
        
        $Precio=$_POST['price'];
        
        $Existencia=$_POST['existence'];
        
        $Contenido=$_POST['neto'];
        
        $Folio=$_POST['fol'];
         
        $conectar = mysqli_connect($bd_host, $bd_user, $bd_pass, $bd_name);
            if (mysqli_connect_errno())
            {
                printf("ERROR: %u - %s", mysqli_connect_errno(), mysqli_connect_errno());
                exit();
            }
            mysqli_set_charset($conectar, "utf8"); 
        $Alta = "INSERT INTO productos (nombre_produ, precio_produ, existencia, contenido, folio_produ) values ('$Nombre','$Precio','$Existencia','$Contenido','$Folio' )";
        
        if ($resultado = mysqli_query($conectar, $Alta))
        {
            printf("Se ha Registrado tu producto");
        }
        else
        {
            printf("Ups! ha surgido un problema por favor verifica los datos");
        }
        mysqli_close($conectar);
        ?>
       <center><a href="Sesion.php">
        <img src="Images/Inicio.png" width="20%" height="20%">
        </a>
        </center>
        </div>
        <body background="Images/bg_slider.jpg" >
        </body>
    </body>
</html>