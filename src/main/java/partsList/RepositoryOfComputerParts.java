package partsList;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.PagingAndSortingRepository;



public interface RepositoryOfComputerParts extends CrudRepository<ComputerPart, Long>, PagingAndSortingRepository<ComputerPart, Long> {

    ComputerPart findByName(String name);

}
