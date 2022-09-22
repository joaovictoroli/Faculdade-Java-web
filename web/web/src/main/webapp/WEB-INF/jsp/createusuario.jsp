<!DOCTYPE html>
<html>
<head>
   <title>Add Produto</title>
   <link href="https://cdn.jsdelivr.net/npm/bootstrap@5.1.3/dist/css/bootstrap.min.css" rel="stylesheet" integrity="sha384-1BmE4kWBq78iYhFldvKuhfTAU6auU8tT94WrHftjDbrCEXSU1oBoqyl2QvZ6jIW3" crossorigin="anonymous">
   <script src="https://cdn.jsdelivr.net/npm/bootstrap@5.1.3/dist/js/bootstrap.bundle.min.js" integrity="sha384-ka7Sk0Gln4gmtz2MlQnikT1wXgYsOg+OMhuP+IlRH9sENBO0LRn5q+8nbTov4+1p" crossorigin="anonymous"></script>
   <link href="https://fonts.googleapis.com/icon?family=Material+Icons" rel="stylesheet">
    <%@ taglib uri="http://www.springframework.org/tags/form" prefix="form"%>
    <%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
    <style>
    p {
        vertical-align: middle;
    }
    </style>
</head>
<body class= "bg-dark">
    <body class="d-flex flex-column h-100">
       <main class="flex-shrink-0">
           <!-- Navigation-->
           <nav class="navbar navbar-expand-lg navbar-dark bg-dark">
               <div class="container px-5">
                   <a class="navbar-brand">AT Java - Joao Victor F Oliveira</a>
                   <button class="navbar-toggler" type="button" data-bs-toggle="collapse" data-bs-target="#navbarSupportedContent" aria-controls="navbarSupportedContent" aria-expanded="false" aria-label="Toggle navigation"><span class="navbar-toggler-icon"></span></button>
                   <div class="collapse navbar-collapse" id="navbarSupportedContent">
                       <ul class="navbar-nav ms-auto mb-2 mb-lg-0">
                           <li class="nav-item"><a class="nav-link" href="/">Index</a></li>
                           <li class="nav-item"><a class="nav-link" href="/show-produtos">Produtos</a></li>
                           <li class="nav-item"><a class="nav-link" href="/show-usuarios">Usuarios</a></li>
                       </ul>
                   </div>
               </div>
           </nav>
           <header class="bg-dark py-5">
            <div class="container px-8">
<h1 class="text-white">Create Usuario</h1>
</br>

<form:form method="post" action="/create-usuario">
    <div class="form-group">
        <label class="col-sm-2 col-form-label"><p class="text-white">Email:</p></label>
      <form:input path="email"/>
    </div>

    <div class="form-group">
        <label class="col-sm-2 col-form-label"><p class="text-white">Nome:</p></label>
        <form:input path="nome"/>
    </div>

    <div class="form-group">
        <label class="col-sm-2 col-form-label"><p class="text-white">Telefone:</p></label>
        <form:input path="telefone"/>
    </div>
            
    <div class="form-group">
        <label class="col-sm-2 col-form-label"><p class="text-white">CEP</p></label>
        <form:input path="CEP"/>
    </div>

    <div class="form-group">
        <label class="col-sm-2 col-form-label"><p class="text-white">Numero:</p></label>
        <form:input path="numero"/>
    </div>

    <div class="form-group">
        <label class="col-sm-2 col-form-label"><p class="text-white">Complemento:</p></label>
        <form:input path="complemento"/>
    </div>
</br>
        <button type="submit" class="btn btn-secondary" value="Create" >
         Add Usuario</button>

</form:form>

</header>
</main>

<footer class="bg-dark py-4 mt-auto fixed-bottom">
   <div class="container px-5">
       <div class="row align-items-center justify-content-between flex-column flex-sm-row">
           <div class="col-auto"><div class="small m-0 text-white">Copyright &copy; Your Website 2022</div></div>
           <div class="col-auto">
               <a class="link-light small" href="#!">Privacy</a>
               <span class="text-white mx-1">&middot;</span>
               <a class="link-light small" href="#!">Terms</a>
               <span class="text-white mx-1">&middot;</span>
               <a class="link-light small" href="#!">Contact</a>
           </div>
       </div>
   </div>
</footer>
</body>
</html>