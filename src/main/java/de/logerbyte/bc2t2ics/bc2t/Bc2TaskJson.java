package de.logerbyte.bc2t2ics.bc2t;

import java.util.List;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

public class Bc2TaskJson {

    @SerializedName("class-type")
    @Expose
    private String classType;
    @SerializedName("allDayBeforeMoveToToday")
    @Expose
    private Boolean allDayBeforeMoveToToday;
    @SerializedName("beginBeforeMoveToToday")
    @Expose
    private Long beginBeforeMoveToToday;
    @SerializedName("emoticon")
    @Expose
    private Long emoticon;
    @SerializedName("extraSubtask")
    @Expose
    private Boolean extraSubtask;
    @SerializedName("hasSubTasks")
    @Expose
    private Boolean hasSubTasks;
    @SerializedName("movedToToday")
    @Expose
    private Boolean movedToToday;
    @SerializedName("priority")
    @Expose
    private Long priority;
    @SerializedName("status")
    @Expose
    private Boolean status;
    @SerializedName("subTasks")
    @Expose
    private List<Object> subTasks = null;
    @SerializedName("trashed")
    @Expose
    private Boolean trashed;
    @SerializedName("useCompletionDate")
    @Expose
    private Boolean useCompletionDate;
    @SerializedName("accountId")
    @Expose
    private String accountId;
    @SerializedName("accountName")
    @Expose
    private String accountName;
    @SerializedName("accountType")
    @Expose
    private String accountType;
    @SerializedName("allDay")
    @Expose
    private Boolean allDay;
    @SerializedName("begin")
    @Expose
    private Long begin;
    @SerializedName("canInvite")
    @Expose
    private Boolean canInvite;
    @SerializedName("canModify")
    @Expose
    private Boolean canModify;
    @SerializedName("canRespond")
    @Expose
    private Boolean canRespond;
    @SerializedName("collectionAccessLevel")
    @Expose
    private Long collectionAccessLevel;
    @SerializedName("collectionColor")
    @Expose
    private Long collectionColor;
    @SerializedName("collectionFavorite")
    @Expose
    private Long collectionFavorite;
    @SerializedName("collectionId")
    @Expose
    private String collectionId;
    @SerializedName("collectionIsPrimary")
    @Expose
    private Boolean collectionIsPrimary;
    @SerializedName("collectionName")
    @Expose
    private String collectionName;
    @SerializedName("collectionTimeZone")
    @Expose
    private String collectionTimeZone;
    @SerializedName("collectionVisible")
    @Expose
    private Boolean collectionVisible;
    @SerializedName("color")
    @Expose
    private Long color;
    @SerializedName("description")
    @Expose
    private String description;
    @SerializedName("dtend")
    @Expose
    private Long dtend;
    @SerializedName("dtstart")
    @Expose
    private Long dtstart;
    @SerializedName("end")
    @Expose
    private Long end;
    @SerializedName("endDay")
    @Expose
    private Long endDay;
    @SerializedName("endMinute")
    @Expose
    private Long endMinute;
    @SerializedName("fakeBegin")
    @Expose
    private Long fakeBegin;
    @SerializedName("fakeEnd")
    @Expose
    private Long fakeEnd;
    @SerializedName("fakeTimes")
    @Expose
    private Boolean fakeTimes;
    @SerializedName("flagBoolean1")
    @Expose
    private Boolean flagBoolean1;
    @SerializedName("flagBoolean2")
    @Expose
    private Boolean flagBoolean2;
    @SerializedName("flagBoolean3")
    @Expose
    private Boolean flagBoolean3;
    @SerializedName("flagBoolean4")
    @Expose
    private Boolean flagBoolean4;
    @SerializedName("hasReminders")
    @Expose
    private Boolean hasReminders;
    @SerializedName("id")
    @Expose
    private String id;
    @SerializedName("isEventCopy")
    @Expose
    private Boolean isEventCopy;
    @SerializedName("itemId")
    @Expose
    private String itemId;
    @SerializedName("location")
    @Expose
    private String location;
    @SerializedName("mColumn")
    @Expose
    private Long mColumn;
    @SerializedName("mMaxColumns")
    @Expose
    private Long mMaxColumns;
    @SerializedName("markedForDeletion")
    @Expose
    private Boolean markedForDeletion;
    @SerializedName("multiDayDuplicate")
    @Expose
    private Boolean multiDayDuplicate;
    @SerializedName("multiDayOriginalBegin")
    @Expose
    private Long multiDayOriginalBegin;
    @SerializedName("multiDayOriginalStartDay")
    @Expose
    private Long multiDayOriginalStartDay;
    @SerializedName("multiDayOriginalStartMinute")
    @Expose
    private Long multiDayOriginalStartMinute;
    @SerializedName("startDay")
    @Expose
    private Long startDay;
    @SerializedName("startMinute")
    @Expose
    private Long startMinute;
    @SerializedName("textColorOnBlankBg")
    @Expose
    private Long textColorOnBlankBg;
    @SerializedName("textColorOnColoredBgIsWhite")
    @Expose
    private Boolean textColorOnColoredBgIsWhite;
    @SerializedName("timeZone")
    @Expose
    private String timeZone;
    @SerializedName("title")
    @Expose
    private String title;

    public String getClassType() {
        return classType;
    }

    public void setClassType(String classType) {
        this.classType = classType;
    }

    public Boolean getAllDayBeforeMoveToToday() {
        return allDayBeforeMoveToToday;
    }

    public void setAllDayBeforeMoveToToday(Boolean allDayBeforeMoveToToday) {
        this.allDayBeforeMoveToToday = allDayBeforeMoveToToday;
    }

    public Long getBeginBeforeMoveToToday() {
        return beginBeforeMoveToToday;
    }

    public void setBeginBeforeMoveToToday(Long beginBeforeMoveToToday) {
        this.beginBeforeMoveToToday = beginBeforeMoveToToday;
    }

    public Long getEmoticon() {
        return emoticon;
    }

    public void setEmoticon(Long emoticon) {
        this.emoticon = emoticon;
    }

    public Boolean getExtraSubtask() {
        return extraSubtask;
    }

    public void setExtraSubtask(Boolean extraSubtask) {
        this.extraSubtask = extraSubtask;
    }

    public Boolean getHasSubTasks() {
        return hasSubTasks;
    }

    public void setHasSubTasks(Boolean hasSubTasks) {
        this.hasSubTasks = hasSubTasks;
    }

    public Boolean getMovedToToday() {
        return movedToToday;
    }

    public void setMovedToToday(Boolean movedToToday) {
        this.movedToToday = movedToToday;
    }

    public Long getPriority() {
        return priority;
    }

    public void setPriority(Long priority) {
        this.priority = priority;
    }

    public Boolean getStatus() {
        return status;
    }

    public void setStatus(Boolean status) {
        this.status = status;
    }

    public List<Object> getSubTasks() {
        return subTasks;
    }

    public void setSubTasks(List<Object> subTasks) {
        this.subTasks = subTasks;
    }

    public Boolean getTrashed() {
        return trashed;
    }

    public void setTrashed(Boolean trashed) {
        this.trashed = trashed;
    }

    public Boolean getUseCompletionDate() {
        return useCompletionDate;
    }

    public void setUseCompletionDate(Boolean useCompletionDate) {
        this.useCompletionDate = useCompletionDate;
    }

    public String getAccountId() {
        return accountId;
    }

    public void setAccountId(String accountId) {
        this.accountId = accountId;
    }

    public String getAccountName() {
        return accountName;
    }

    public void setAccountName(String accountName) {
        this.accountName = accountName;
    }

    public String getAccountType() {
        return accountType;
    }

    public void setAccountType(String accountType) {
        this.accountType = accountType;
    }

    public Boolean getAllDay() {
        return allDay;
    }

    public void setAllDay(Boolean allDay) {
        this.allDay = allDay;
    }

    public Long getBegin() {
        return begin;
    }

    public void setBegin(Long begin) {
        this.begin = begin;
    }

    public Boolean getCanInvite() {
        return canInvite;
    }

    public void setCanInvite(Boolean canInvite) {
        this.canInvite = canInvite;
    }

    public Boolean getCanModify() {
        return canModify;
    }

    public void setCanModify(Boolean canModify) {
        this.canModify = canModify;
    }

    public Boolean getCanRespond() {
        return canRespond;
    }

    public void setCanRespond(Boolean canRespond) {
        this.canRespond = canRespond;
    }

    public Long getCollectionAccessLevel() {
        return collectionAccessLevel;
    }

    public void setCollectionAccessLevel(Long collectionAccessLevel) {
        this.collectionAccessLevel = collectionAccessLevel;
    }

    public Long getCollectionColor() {
        return collectionColor;
    }

    public void setCollectionColor(Long collectionColor) {
        this.collectionColor = collectionColor;
    }

    public Long getCollectionFavorite() {
        return collectionFavorite;
    }

    public void setCollectionFavorite(Long collectionFavorite) {
        this.collectionFavorite = collectionFavorite;
    }

    public String getCollectionId() {
        return collectionId;
    }

    public void setCollectionId(String collectionId) {
        this.collectionId = collectionId;
    }

    public Boolean getCollectionIsPrimary() {
        return collectionIsPrimary;
    }

    public void setCollectionIsPrimary(Boolean collectionIsPrimary) {
        this.collectionIsPrimary = collectionIsPrimary;
    }

    public String getCollectionName() {
        return collectionName;
    }

    public void setCollectionName(String collectionName) {
        this.collectionName = collectionName;
    }

    public String getCollectionTimeZone() {
        return collectionTimeZone;
    }

    public void setCollectionTimeZone(String collectionTimeZone) {
        this.collectionTimeZone = collectionTimeZone;
    }

    public Boolean getCollectionVisible() {
        return collectionVisible;
    }

    public void setCollectionVisible(Boolean collectionVisible) {
        this.collectionVisible = collectionVisible;
    }

    public Long getColor() {
        return color;
    }

    public void setColor(Long color) {
        this.color = color;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public Long getDtend() {
        return dtend;
    }

    public void setDtend(Long dtend) {
        this.dtend = dtend;
    }

    public Long getDtstart() {
        return dtstart;
    }

    public void setDtstart(Long dtstart) {
        this.dtstart = dtstart;
    }

    public Long getEnd() {
        return end;
    }

    public void setEnd(Long end) {
        this.end = end;
    }

    public Long getEndDay() {
        return endDay;
    }

    public void setEndDay(Long endDay) {
        this.endDay = endDay;
    }

    public Long getEndMinute() {
        return endMinute;
    }

    public void setEndMinute(Long endMinute) {
        this.endMinute = endMinute;
    }

    public Long getFakeBegin() {
        return fakeBegin;
    }

    public void setFakeBegin(Long fakeBegin) {
        this.fakeBegin = fakeBegin;
    }

    public Long getFakeEnd() {
        return fakeEnd;
    }

    public void setFakeEnd(Long fakeEnd) {
        this.fakeEnd = fakeEnd;
    }

    public Boolean getFakeTimes() {
        return fakeTimes;
    }

    public void setFakeTimes(Boolean fakeTimes) {
        this.fakeTimes = fakeTimes;
    }

    public Boolean getFlagBoolean1() {
        return flagBoolean1;
    }

    public void setFlagBoolean1(Boolean flagBoolean1) {
        this.flagBoolean1 = flagBoolean1;
    }

    public Boolean getFlagBoolean2() {
        return flagBoolean2;
    }

    public void setFlagBoolean2(Boolean flagBoolean2) {
        this.flagBoolean2 = flagBoolean2;
    }

    public Boolean getFlagBoolean3() {
        return flagBoolean3;
    }

    public void setFlagBoolean3(Boolean flagBoolean3) {
        this.flagBoolean3 = flagBoolean3;
    }

    public Boolean getFlagBoolean4() {
        return flagBoolean4;
    }

    public void setFlagBoolean4(Boolean flagBoolean4) {
        this.flagBoolean4 = flagBoolean4;
    }

    public Boolean getHasReminders() {
        return hasReminders;
    }

    public void setHasReminders(Boolean hasReminders) {
        this.hasReminders = hasReminders;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public Boolean getIsEventCopy() {
        return isEventCopy;
    }

    public void setIsEventCopy(Boolean isEventCopy) {
        this.isEventCopy = isEventCopy;
    }

    public String getItemId() {
        return itemId;
    }

    public void setItemId(String itemId) {
        this.itemId = itemId;
    }

    public String getLocation() {
        return location;
    }

    public void setLocation(String location) {
        this.location = location;
    }

    public Long getMColumn() {
        return mColumn;
    }

    public void setMColumn(Long mColumn) {
        this.mColumn = mColumn;
    }

    public Long getMMaxColumns() {
        return mMaxColumns;
    }

    public void setMMaxColumns(Long mMaxColumns) {
        this.mMaxColumns = mMaxColumns;
    }

    public Boolean getMarkedForDeletion() {
        return markedForDeletion;
    }

    public void setMarkedForDeletion(Boolean markedForDeletion) {
        this.markedForDeletion = markedForDeletion;
    }

    public Boolean getMultiDayDuplicate() {
        return multiDayDuplicate;
    }

    public void setMultiDayDuplicate(Boolean multiDayDuplicate) {
        this.multiDayDuplicate = multiDayDuplicate;
    }

    public Long getMultiDayOriginalBegin() {
        return multiDayOriginalBegin;
    }

    public void setMultiDayOriginalBegin(Long multiDayOriginalBegin) {
        this.multiDayOriginalBegin = multiDayOriginalBegin;
    }

    public Long getMultiDayOriginalStartDay() {
        return multiDayOriginalStartDay;
    }

    public void setMultiDayOriginalStartDay(Long multiDayOriginalStartDay) {
        this.multiDayOriginalStartDay = multiDayOriginalStartDay;
    }

    public Long getMultiDayOriginalStartMinute() {
        return multiDayOriginalStartMinute;
    }

    public void setMultiDayOriginalStartMinute(Long multiDayOriginalStartMinute) {
        this.multiDayOriginalStartMinute = multiDayOriginalStartMinute;
    }

    public Long getStartDay() {
        return startDay;
    }

    public void setStartDay(Long startDay) {
        this.startDay = startDay;
    }

    public Long getStartMinute() {
        return startMinute;
    }

    public void setStartMinute(Long startMinute) {
        this.startMinute = startMinute;
    }

    public Long getTextColorOnBlankBg() {
        return textColorOnBlankBg;
    }

    public void setTextColorOnBlankBg(Long textColorOnBlankBg) {
        this.textColorOnBlankBg = textColorOnBlankBg;
    }

    public Boolean getTextColorOnColoredBgIsWhite() {
        return textColorOnColoredBgIsWhite;
    }

    public void setTextColorOnColoredBgIsWhite(Boolean textColorOnColoredBgIsWhite) {
        this.textColorOnColoredBgIsWhite = textColorOnColoredBgIsWhite;
    }

    public String getTimeZone() {
        return timeZone;
    }

    public void setTimeZone(String timeZone) {
        this.timeZone = timeZone;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public void toScreen() {

    }

}

