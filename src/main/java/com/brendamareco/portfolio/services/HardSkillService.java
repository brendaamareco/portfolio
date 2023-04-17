package com.brendamareco.portfolio.services;

import com.brendamareco.portfolio.entities.HardSkill;
import com.brendamareco.portfolio.repositories.HardSkillRepository;

public class HardSkillService extends AbstractService<HardSkill, Long>
{
    public HardSkillService(HardSkillRepository repository){ super(repository); }
}
