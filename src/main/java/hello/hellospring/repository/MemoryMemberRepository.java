package hello.hellospring.repository;

import java.lang.reflect.Member;

public class MemoryMemberRepository implements MemberRepository {

    private static Map<Long, Member> store = new HashMap<>();
    @Override
    public Member save(Memver memver) {
        return null;
    }

    @Override
    public Optional<Member> findById(Long id) {
        return null;
    }

    @Override
    public Optional<Member> findByName(String name) {
        return null;
    }

    @Override
    public List<Member> findAll() {
        return null;
    }
}
