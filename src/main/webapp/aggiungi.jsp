<html>
    <head>
        <title>Dizionario Java Bean</title>
    </head>
    <body>
		<h1>Dizionario Java Bean</h1>
		<p>Risultato funzione:</p>
		<jsp:useBean id="s" class="servlet.Aggiungi"/>
        <jsp:setProperty name="s" property="termine" param="termine" />
        <jsp:setProperty name="s" property="significato" param="significato" />
		<jsp:getProperty name="s" property="risultato" />
		<br>
		<a href="index.html">Torna alla Home</a>
    </body>
</html>