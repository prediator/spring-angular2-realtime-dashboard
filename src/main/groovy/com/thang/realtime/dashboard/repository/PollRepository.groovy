package com.thang.realtime.dashboard.repository

import com.thang.realtime.dashboard.domain.Poll
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

/**
 * Created by thangnguyen on 5/22/16.
 */
@Repository
public interface PollRepository extends CrudRepository<Poll,Long> {
}
