<?php
    $txt_menu_inicio = "Inicio";
    $txt_menu_alumnos = "Alumnos";
    $txt_menu_profesores = "Profesores";
    $txt_menu_aulas  = "Aulas";
    $txt_menu_asignaturas = "Asignaturas";
    
    if($_REQUEST['action'] == 0){
        $txt_menu_inicio = ">>> Inicio";
    }
    if($_REQUEST['action'] == 1){
        $txt_menu_alumnos = ">>> Alumnos";
    }
    if($_REQUEST['action'] == 2){
        $txt_menu_profesores = ">>> Profesores";
    }
    if($_REQUEST['action'] == 3){
        $txt_menu_aulas = ">>> Aulas";
    }
    if($_REQUEST['action'] == 4){
        $txt_menu_asignaturas = ">>> Asignaturas";
    }
