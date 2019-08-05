package todolist.dao;

import org.springframework.data.mongodb.repository.Query;
import org.springframework.stereotype.Repository;
import todolist.domain.TaskDetail;
import org.springframework.data.mongodb.repository.MongoRepository;

@Repository
public interface TaskRepository extends MongoRepository<TaskDetail, String> {

  /**
   * This method finds the task by its id and gives information about it
   *
   * @param taskId - id of the task for searching.
   * @return returns instance {@link TaskDetail} with information about the task.
   */
  @Query
  TaskDetail findByTaskId(final String taskId);
}