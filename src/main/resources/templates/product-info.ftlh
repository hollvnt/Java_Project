<!DOCTYPE HTML>
<html>
<head>
    <title>Test</title>
</head>
<body>
<h1>Hello</h1>
<h4>Подробная инфа о товаре</h4>
<b>Название товара: </b> ${product.titile}</br>
<b>Описание товара: </b> ${product.description}</br>
<b>Цена: </b> ${product.price}</br>
<b>Город: </b> ${product.cuty}</br>
<b>Автор: </b> ${product.author}</br>
<hr>
<form action="/product/delete/${product.id}" method="post">
    <input type="submit" value="удалить товар" />
</form>
</body>
</html>