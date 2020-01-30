<html>
    <head>
        <title>Dizionario Java Bean</title>
    </head>
    <body>
		<h1>Dizionario Java Bean</h1>
		<p>Risultato funzione:</p>
		<jsp:useBean id="s" class="app.Elimina"/>
		<jsp:setProperty name="s" property="risultato" param="termine" />
		<jsp:getProperty name="s" property="risultato" />
		<br>
		<a href="index.html">Torna alla Home</a>
    </body>
</html>