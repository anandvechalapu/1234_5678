@Repository
public interface ExecutiveMemosRepository extends CrudRepository<ExecutiveMemos, Long> {
 
    List<ExecutiveMemos> findByMemo(String memo);
 
    List<ExecutiveMemos> findByDateCreated(String dateCreated);
 
    List<ExecutiveMemos> findByDow(String dow);
 
    void deleteByMemo(String memo);
 
    List<ExecutiveMemos> findByAccess(boolean access);
 
    List<ExecutiveMemos> findByFieldNameAndDescriptionPrompt(String fieldName, String descriptionPrompt);
 
}