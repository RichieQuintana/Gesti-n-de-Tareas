import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

import java.util.List;
import java.util.ArrayList;

public class TaskManagerTest {

    @Test
    public void testAddTask() {
        TaskManager tm = new TaskManager();
        tm.addTask("Nueva tarea");
        // Este test no puede acceder directamente a la lista, así que se basa en la salida visible
        // Aquí podrías modificar TaskManager para permitir obtener el número de tareas
        // o usar reflexión (en pruebas más avanzadas)
        // Por ahora solo validamos que no lanza errores
        assertDoesNotThrow(() -> tm.addTask("Otra tarea"));
    }

    @Test
    public void testRemoveInvalidTask() {
        TaskManager tm = new TaskManager();
        assertThrows(IndexOutOfBoundsException.class, () -> tm.removeTask(1));
    }
}
