package com.example.service.UserService;

public interface ImailService {
    /**
     * 发送文本邮件
     *
     * @param to      收件人
     * @param subject 主题
     * @param content 内容
     */
    boolean sendSimpleMail(String to, String subject, String content);

    /***
     * 发送html邮件
     * @param to 收件人
     * @param subject 主题
     * @param content 内容
     */
    boolean sendHtmlMail(String to, String subject, String content);

    /***
     * 发送带附件邮件
     * @param to 收件人
     * @param subject 主题
     * @param content 内容
     * @Param filePath 附件
     */
    boolean sendAttachmentsMail(String to, String subject, String content, String filePath);
}
