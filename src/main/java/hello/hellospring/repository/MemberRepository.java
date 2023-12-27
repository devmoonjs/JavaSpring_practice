package hello.hellospring.repository;

public interface MemberRepository {
    Member save(Memver memver);
    Optional<Member> findById(Long id);
    Optional<Member> findByName(String name);
    List<Member> findAll();
}
