//package com.kehang.wiki.controller;
//
//<<<<<<< HEAD
//import com.kehang.wiki.req.EbookQueryReq;
//import com.kehang.wiki.req.EbookSaveReq;
//import com.kehang.wiki.resp.CommonResp;
//import com.kehang.wiki.resp.EbookQueryResp;
//import com.kehang.wiki.resp.PageResp;
//=======
//import com.kehang.wiki.req.EbookReq;
//import com.kehang.wiki.resp.CommonResp;
//import com.kehang.wiki.resp.EbookResp;
//>>>>>>> 9afa22b (3-7 封装请求参数和返回参数)
//import com.kehang.wiki.service.EbookService;
//import org.slf4j.Logger;
//import org.slf4j.LoggerFactory;
//import org.springframework.web.bind.annotation.*;
//import org.springframework.web.multipart.MultipartFile;
//
//import javax.annotation.Resource;
//import javax.validation.Valid;
//import java.io.File;
//import java.io.IOException;
//
//@RestController
//@RequestMapping("/ebook")
//public class EbookController {
//
//    private static final Logger LOG = LoggerFactory.getLogger(EbookController.class);
//
//    @Resource
//    private EbookService ebookService;
//
//    @GetMapping("/list")
//<<<<<<< HEAD
//    public CommonResp list(@Valid EbookQueryReq req) {
//        CommonResp<PageResp<EbookQueryResp>> resp = new CommonResp<>();
//        PageResp<EbookQueryResp> list = ebookService.list(req);
//=======
//    public CommonResp list(EbookReq req) {
//        CommonResp<List<EbookResp>> resp = new CommonResp<>();
//        List<EbookResp> list = ebookService.list(req);
//>>>>>>> 9afa22b (3-7 封装请求参数和返回参数)
//        resp.setContent(list);
//        return resp;
//    }
//
//    @PostMapping("/save")
//    public CommonResp save(@Valid @RequestBody EbookSaveReq req) {
//        CommonResp resp = new CommonResp<>();
//        ebookService.save(req);
//        return resp;
//    }
//
//    @DeleteMapping("/delete/{id}")
//    public CommonResp delete(@PathVariable Long id) {
//        CommonResp resp = new CommonResp<>();
//        ebookService.delete(id);
//        return resp;
//    }
//
//    @RequestMapping("/upload/avatar")
//    public CommonResp upload(@RequestParam MultipartFile avatar) throws IOException {
//        LOG.info("上传文件开始：{}", avatar);
//        LOG.info("文件名：{}", avatar.getOriginalFilename());
//        LOG.info("文件大小：{}", avatar.getSize());
//
//        // 保存文件到本地
//        String fileName = avatar.getOriginalFilename();
//        String fullPath = "D:/file/wiki/" + fileName;
//        File dest = new File(fullPath);
//        avatar.transferTo(dest);
//        LOG.info(dest.getAbsolutePath());
//
//        return new CommonResp();
//    }
//}
