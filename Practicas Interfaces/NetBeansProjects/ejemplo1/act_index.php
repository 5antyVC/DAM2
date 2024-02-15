<?php

    if($_REQUEST['action'] == 0){
        $txt_contenido = "contenido/principal/dsp_principal.php";
    }
    if($_REQUEST['action'] == 1){
        $txt_contenido = "contenido/alumnos/dsp_alumnos.php";
    }
    if($_REQUEST['action'] == 2){
        $txt_contenido = "contenido/profesores/dsp_profesores.php";
    }
    if($_REQUEST['action'] == 3){
        $txt_contenido = "contenido/aulas/dsp_aulas.php";
    }
    if($_REQUEST['action'] == 4){
        $txt_contenido = "contenido/asignaturas/dsp_asignaturas.php";
    }
