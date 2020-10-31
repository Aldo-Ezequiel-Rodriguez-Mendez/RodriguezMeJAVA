## JAVA THREAD SCHEDULER
<hr></hr>
<p>En un mundo idealizado, todos los subprocesos del programa tendrían sus propios procesadores en los que ejecutarse. Hasta que llegue el momento en que las computadoras tengan miles o millones de procesadores, los subprocesos a menudo deben compartir uno o más procesadores. </p>
<p>La JVM o el sistema operativo de la plataforma, descifra cómo compartir el recurso del procesador entre subprocesos, una tarea conocida como "Thread Scheduling". Esta es la parte de la JVM o del sistema operativo que realiza la programación de subprocesos.</p>

### Características
------------------------
* El Thread Scheduler en Java es la parte de la JVM que decide qué subproceso debe ejecutarse.
* No hay garantía de que el Thread Sheduler elija qué subproceso ejecutable se vaya a llevar a cabo.
* Solo se puede ejecutar un subproceso a la vez en un solo proceso. En Java es la parte de la JVM quien decide qué subproceso debe   ejecutarse.
* Solo se puede ejecutar un subproceso a la vez en un solo proceso.
* Utiliza principalmente la programación preventiva o de corte de tiempo para programar los subprocesos.
 <br></br>
