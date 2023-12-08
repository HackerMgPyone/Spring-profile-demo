package org.example.repository;

import org.example.ds.Report;
import org.springframework.context.annotation.Profile;
import org.springframework.stereotype.Component;

@Component @Profile("Db")
public class DbReportRepository implements ReportRepository{
    @Override
    public Report save(Report report) {
        System.out.println(this.getClass().getSimpleName()+
                "::save(Report report)");
        return null;
    }
}
