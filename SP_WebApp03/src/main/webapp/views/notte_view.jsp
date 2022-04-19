<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Patrizio è convinto che io sia fan di Stephen King</title>
<link href="https://cdn.jsdelivr.net/npm/bootstrap@5.1.3/dist/css/bootstrap.min.css" rel="stylesheet">
<script src="https://cdn.jsdelivr.net/npm/bootstrap@5.1.3/dist/js/bootstrap.bundle.min.js"></script>

<link rel="stylesheet" type="text/css" href="static/css/notte.css"/>
</head>
<body>
<h1>ciao <span class="badge bg-secondary">New</span></h1>
<div class="toast" role="alert" aria-live="assertive" aria-atomic="true">
  <div class="toast-header">
    <strong class="me-auto">Bootstrap</strong>
    <small class="text-muted">11 mins ago</small>
    <button type="button" class="btn-close" data-bs-dismiss="toast" aria-label="Close"></button>
  </div>
  <div class="toast-body">
    Hello, world! This is a toast message.
  </div>
</div>
<h1>Ecco la stupenda vista di una foresta di notte</h1>
<h4>Spooky</h4>
<img src="static/images/ForestaNotte.jpg">

<nav aria-label="breadcrumb">
  <ol class="breadcrumb">
    <li class="breadcrumb-item active" aria-current="page">Solo Una foresta</li>
  </ol>
</nav>

<nav aria-label="breadcrumb">
  <ol class="breadcrumb">
    <li class="breadcrumb-item"><a href="#">Solo Una foresta</a></li>
    <li class="breadcrumb-item active" aria-current="page">Vuoi anche una luna?</li>
  </ol>
</nav>
<nav aria-label="breadcrumb">
  <ol class="breadcrumb">
    <li class="breadcrumb-item"><a href="#">Solo Una foresta</a></li>
    <li class="breadcrumb-item"><a href="#">Vuoi anche una luna?</a></li>
    <li class="breadcrumb-item active" aria-current="page">Vabbeh, ok</li>
  </ol>
</nav>
<h3>Vuoi anche altro?</h3>
<h2 class="classe">Ecco a te una luna!</h2>
<img src="https://videohive.img.customer.envatousercontent.com/files/235297396/preview.jpg?auto=compress%2Cformat&fit=crop&crop=top&max-h=8000&max-w=590&s=e5a9bd94e1a6200e3c2602b0a381f4e8">
<div class="dropdown">
  <button class="btn btn-secondary dropdown-toggle" type="button" id="dropdownMenuButton1" data-bs-toggle="dropdown" aria-expanded="false">
    Bottone inutile, cliccarlo non porterà a nulla, stai sprecando il tuo tempo
  </button>
  <ul class="dropdown-menu" aria-labelledby="dropdownMenuButton1">
    <li><a class="dropdown-item" href="#">che</a></li>
    <li><a class="dropdown-item" href="#">ti</a></li>
    <li><a class="dropdown-item" href="#">avevo</a></li>
    <li><a class="dropdown-item" href="#">detto?</a></li>
  </ul>
</div>
</body>

<script src="static/js/notte.js">
</html>