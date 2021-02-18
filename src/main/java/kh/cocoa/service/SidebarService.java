package kh.cocoa.service;

import kh.cocoa.dao.SidebarDAO;
import kh.cocoa.dto.SidebarViewDTO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class SidebarService implements SidebarDAO{

    @Autowired
    private SidebarDAO sdao;

    @Override
    public int sidebarMenuCount() {
        return sdao.sidebarMenuCount();
    }
    @Override
    public int businessLogCount() {
        return sdao.businessLogCount();
    }

    // menu_seq에 따른 리스트의 개수
    @Override
    public int sidebarCountByMenuSeq(int menu_seq) {
        return sdao.sidebarCountByMenuSeq(menu_seq);
    }

    // menu_seq에 따른 리스트
    @Override
    public List<SidebarViewDTO> sidebarListByMenuSeq(int menu_seq) {
        return sdao.sidebarListByMenuSeq(menu_seq);
    }

    @Override
    public List<SidebarViewDTO> getSidebarList() {
        return sdao.getSidebarList();
    }

    @Override
    public List<SidebarViewDTO> getBusinessLogList() {
        return sdao.getBusinessLogList();
    }



}