#consulta 1
use restaurante;
SELECT p.Nombre, dp.Cantidad
FROM Plato p
JOIN Detalle_Pedido dp ON p.ID = dp.Plato_ID
WHERE dp.Pedido_ID = 1;


#consulta 2
SELECT Mesa_ID, COUNT(*) AS Cantidad_de_pedidos
FROM Pedido
GROUP BY Mesa_ID;

#consulta 3
SELECT c.Nombre AS Nombre_del_Camarero, SUM(p.Total) AS Monto_de_Ventas
FROM Camarero c
JOIN Pedido p ON c.ID = p.Camarero_ID
GROUP BY c.Nombre
ORDER BY Nombre_del_Camarero DESC;

#consulta 4
SELECT p.Nombre AS Plato_Mas_Solicitado, COUNT(*) AS Cantidad_de_Solicitudes
FROM Plato p
JOIN Detalle_Pedido dp ON p.ID = dp.Plato_ID
GROUP BY p.ID, p.Nombre
ORDER BY Cantidad_de_Solicitudes DESC
LIMIT 1;

#Consulta 5
SELECT p.Nombre AS Plato_Vendido, SUM(d.Subtotal) AS Valor_Total
FROM Plato p
JOIN Detalle_Pedido d ON p.ID = d.Plato_ID
GROUP BY p.ID, p.Nombre
ORDER BY Plato_Vendido ASC;