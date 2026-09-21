TP 2 programación Prof:  Cesar Augusto Fernandez Carbonell
Alumnos: Yolando mariano, Seoane Alan.


RESPUESTAS: 

b1-Enunciado:

La escuela tiene un nombre y funciona en una playa. Ofrece turnos: cada turno tiene una fecha, un
horario, un instructor a cargo y un cupo máximo de alumnos. Si la escuela cierra, sus turnos dejan de
existir.
Cada instructor tiene nombre, apellido y número de matrícula. Un instructor da varios turnos, y sigue
siendo instructor aunque no tenga ningún turno asignado: trabaja también para otras escuelas de la
zona.
La escuela tiene tablas de alquiler. De cada tabla se registran un código, su largo en pies y si está
disponible o en reparación. Las tablas se reparten entre los turnos según haga falta, y una tabla que
hoy se usó en un turno mañana se usa en otro.
Los alumnos tienen nombre, apellido, DNI y nivel (principiante o intermedio). Cada alumno recibe un
número de alumno que la escuela asigna sola, correlativo, empezando en 1. Nadie lo escribe a mano.
Un alumno se inscribe a un turno. De cada inscripción se registra en qué fecha se inscribió, qué tabla se le asignó y si finalmente asistió. Un alumno puede inscribirse a varios turnos, y a un mismo turno se inscriben varios alumnos


lista de sustantivos = 

escuela, nombre, playa, turnos, turno, fecha, horario, instructor, cupo maximo de alumnos, instructor, nombre, apellido, numero de matricula, tablas, alquiler, tabla, codigo, largo en pies, alumnos, nombre, apellido, DNI, nivel, numero, inscripcion, fecha

Posibles clases: 

escuela
turno
instructor
tabla
alumno
inscripción

Posibles atributos: 

(de escuela: nombre, playa)
(de turnos: fecha, horario, cupo máximo)
(de instructor: nombre, apellido, número de matrícula)
(de tablas: código, largo en pies, disponibilidad)
(de alumnos: nombre, apellido, DNI, nivel, número de alumno)
(de inscripción: fecha de inscripción, tabla asignada, asistencia)

Posibles descartes: alquiler, zona.

b4- Composición 
(Rombo negro entre Escuela y Turno): La parte (turno) NO existe sin el todo (escuela), porque el enunciado dice explícitamente que "si la escuela cierra, sus turnos dejan de existir".   
Agregación
 (Rombo blanco entre Turno e Instructor): La parte (instructor) SÍ existe sin el todo (turno), porque el texto aclara que "sigue siendo instructor aunque no tenga ningún turno asignado".   
Agregación 
(Rombo blanco entre Escuela y Tabla): La parte (tabla) SÍ existe independientemente del todo (escuela), ya que aunque "la escuela tiene tablas de alquiler", son objetos físicos que no desaparecen del mundo si la escuela cierra. 
 
b5- nos dimos cuenta que se iba a necesitar una clase Inscripcion porque un alumno puede anotarse en muchos turnos y un turno puede tener muchos alumnos (muchos a muchos), y se guarda informacion dentro de la misma como por ejemplo la fecha que se anotó o si asistió.

b6- B.6 - Revisión del diagrama con las 5 preguntas del taller:
Multiplicidad: Al revisar las conexiones, nos aseguramos de poner las multiplicidades (como 1 y 0..*) en los extremos de todas las líneas, leyendo las relaciones de forma cruzada para que coincidan con la cantidad exacta que pide el enunciado.   
Rombo: Nos hicimos la pregunta de si la parte existe sin el todo, y confirmamos que el rombo entre Escuela y Turno va pintado de negro (composición), porque el TP aclara que si la escuela cierra, los turnos dejan de existir.   
Dónde vive cada atributo: Revisamos la ubicación de los datos y confirmamos que cada atributo está en la clase que le corresponde por naturaleza. Además, nos dimos cuenta de que convenía pasar el DNI, el código de tabla y la matrícula a String para un mejor diseño, y lo dejamos documentado.   
Flechas: Chequeamos las asociaciones que pide el texto y nos aseguramos de dejar bien trazada la flecha directa entre Escuela y Tabla, ya que la escuela gestiona sus propias tablas de alquiler.   
Notación de la caja: Repasamos la sintaxis estricta de UML para confirmar que todos los atributos estén encapsulados en private (-), que los estáticos como numeroAlumno y cupoMaximo queden subrayados, y que a ninguna clase le falte su método +descripcion(): String en el compartimento de abajo.

Preguntas para el README

Respóndanlas en el README.md, en la sección "Preguntas", con sus palabras y en no más de cinco líneas cada una. Se corrigen: son parte del trabajo.

1. El enunciado tiene una relación que necesitó una clase propia. Expliquen qué pasaba si no la creaban, con un ejemplo concreto de este sistema.

Si no creábamos la clase Inscripcion, no tendríamos dónde guardar los datos de ese registro específico. Por ejemplo, si un alumno se anota a un turno, no podríamos registrar qué tabla exacta se le prestó ese día ni si al final asistió o faltó, porque esa información no pertenece solo al alumno ni solo al turno. 

2. Elijan una de las tres relaciones del diagrama y expliquen por qué le pusieron ese rombo y no otro. No repitan la definición: usen la frase del enunciado que los decidió.

Elegimos la relación entre Escuela y Turno y le pusimos el rombo negro de composición. Tomamos esta decisión porque el enunciado dice textualmente que "si la escuela cierra, sus turnos dejan de existir"

3. El número de alumno se resolvió con un atributo static. Expliquen qué habría cambiado si ese contador lo llevaba el main, y por qué el sistema no debería depender de eso.

Si el contador lo llevaba el main, el sistema dependía de que nosotros (quienes usamos el modelo) nos acordáramos de sumar uno y pasarlo correctamente al crear cada alumno. Al ser static adentro de la clase, el sistema es seguro: el alumno se numera solo, de forma correlativa, y evitamos que alguien asigne un número a mano y lo repita.

4. Tuvieron al menos un conflicto de merge. Cuenten cuál fue, qué archivo era y cómo lo resolvieron.

El conflicto ocurrió en el archivo main.java. Al intentar fusionar nuestras ramas, Git nos avisó que ambos habíamos modificado simultáneamente la sección donde se instanciaban los objetos y se armaban las colecciones. Para resolverlo, abrimos el archivo juntos, revisamos las diferencias y acordamos conservar la estructura de arreglos estáticos (como Turno[]) que había diseñado uno de nosotros, adaptando e integrando las nuevas instancias dentro de esa misma lógica para no romper el resto del código. Una vez que unificamos el código, guardamos los cambios, hicimos un git add main.java y finalizamos el merge con éxito

Participacion de los alumnos:

Alan: Mi aporte consistió en el desarrollo de los metodos en las clases principales del sistema y validaciones,  También implementé el control del cupo máximo de inscripciones por turno y realicé las pruebas correspondientes. desarrollé el archivo Main.java, donde realicé la creación y carga de los objetos necesarios para probar el funcionamiento del sistema y sus distintas funcionalidades. Además me encargue de la elaboracion y organizacion del diagrama uml.

Mariano: Hice las clases con sus respectivos constructores, me ocupe de conectar todas las piezas del sistema (por ejemplo, creando la lógica de las inscripciones para unir alumnos con turnos). Además, programe las funcionalidades como la numeración automática, el cálculo de los porcentajes, el agrupamiento por niveles, y me encargue de armar los reportes finales por consola.

