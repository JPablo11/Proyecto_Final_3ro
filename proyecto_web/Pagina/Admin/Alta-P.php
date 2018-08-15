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
        
        $Telefono=$_POST['tele'];
        
        $Folio=$_POST['fol'];
        
         
        $conectar = mysqli_connect($bd_host, $bd_user, $bd_pass, $bd_name);
            if (mysqli_connect_errno())
            {
                printf("ERROR: %u - %s", mysqli_connect_errno(), mysqli_connect_errno());
                exit();
            }
            mysqli_set_charset($conectar, "utf8"); 
        $Alta = "INSERT INTO proveedores (nombre_prov, folio_prov, numero_tel_prov) values ('$Nombre', '$Folio', '$Telefono' )";
        
        if ($resultado = mysqli_query($conectar, $Alta))
        {
            printf("Se ha Registrado tu proveedor");
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