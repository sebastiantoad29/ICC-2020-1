--Torres Aduna Sebastian Ulises--

suma :: Int -> Int -> Int
suma a b = a + b

resta :: Int -> Int -> Int
resta a b = a - b

multiplicacion :: Float -> Float -> Float
multiplicacion a b = a * b


division :: Float -> Float -> Float
division a b = a / b


comparador :: Float -> Float -> Int
comparador a b = if a > b
                   then 1
                 else if a < b
                   then -1
                else 0


maximo :: Float -> Float -> Float -> Float
maximo a b c =
   if a > b
     then if a > c
     then a
     else c
   else if b > c
     then b
     else c


potencia :: Int -> Int -> Int
potencia a b = a ^ b


distanciaPuntos :: Float -> Float -> Float -> Float -> Float
distanciaPuntos a b c d = sqrt((c-a)^2 + (d-b)^2)


pendiente :: Float -> Float -> Float -> Float -> Float
pendiente a b c d = (d - b) / (c - a)


hipotenusa :: Float -> Float -> Float
hipotenusa a b = sqrt(a^2 + b^2)
