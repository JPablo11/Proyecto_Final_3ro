<html>
    <head>
    <title>Cerrar Sesi&oacute;n</title>
    </head>
    <body>
    <?php
        session_start();
        session_destroy();
        header("Location:../iTacos.html");
    ?>
    </body>
</html>