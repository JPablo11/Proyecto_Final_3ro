<html>
<head>
    <title>Taqueria "Juarez"</title> 
    <link type="text/css" rel="stylesheet" href="CSS/stylesheet.css"/>
    </head>
<body>
    <div class="Title2">
        <marquee direction="left"><img src="Images/TaqueriaJuarez.png" width="100%" height="100%"></marquee>
    </div>
    <div class="Title">
        <img src="Images/iTacos.png" height="100%" width="100%">
    </div>
    <div class="Indice">
        <div class="Menu">
           <a href="Alta-productos.html"><img src="Images/Alta.png" width="100%" height="100%"></a>
        </div>
       
    </div>
     <div class="Indice2">
        <div class="Menu">
            <a href="Buscar-productos.html">
       <img src="Images/Busca.png" width="100%" height="100%">
            </a>
        </div>
    </div>
     <div class="Indice3">
       <div class="Menu">
           <a href="Alta-proveedores.html">
           <img src="Images/Alta-proveedor.png" width="100%" height="100%">
           </a>
        </div>
    </div>
     <div class="Indice4">
       <div class="Menu">
        <a href="Actualiza-numero.html">
       <img src="Images/Actualiza.png" width="100%" height="100%">
           </a>
        </div>
    </div>
     <div class="Indice5">
        <div class="Menu">
            <a href="Elimina-productos.html">
       <img src="Images/Elimina.png" width="100%" height="100%">
            </a>
        </div>
    </div>
    <div class="Index">
        <center><img src="Images/iTacos-logo.png" width="40%" height="40%"></center>
          <?php
        session_start();
        if (!isset($_SESSION["nombre_usuario"]))
        {
            header("Location:iTacos.html");
        }
    ?>
        <h1 style="font-family:cursive">Administradores
        <?php
         
            printf("usuario: %s", $_SESSION["nombre_usuario"]);
        ?>
            </h1>
        <br><a href="cerrar-sesion.php"><img src="Images/Cierra.png"></a>
    </div>
  
        <body background="Images/bg_top_img.jpg" >
    </body>
         
            </body>
</html>