//import ajax from 'tui-code-snippet/ajax';

var calendar = new tui.Calendar('#calendar', {
         defaultView:'week',
         useCreationPopup: true,
         useDetailPopup: true
//         hourStart:'8:00', // 얘네 설정을 어또케 하쥐,,?
//         hourEnd:'23:00'
      }); 
//아 캘린더 시간대 정하는거 이거 어떻게 했지,,? 

clear.addEventListener('click', () => {
    calendar.clear();// 일정 전체 삭제
});
nextBtn.addEventListener('click', () => {
      calendar.next();// 현재 뷰 기준으로 다음 뷰로 이동
});
prevBtn.addEventListener('click', () => {
     calendar.prev();// 현재 뷰 기준으로 이전 뷰로 이동
});
//아 캘린더 시간대 정하는거 이거 어떻게 했지,,? 옆에 그 디브 하나 더 만들어야하나? 그 날짜 나오게하는거,,! 
//$(document).ready(function() {//아작스 이용해서 저장된 데이터 저기어디냐 그 어디더라 뿌리는거,,!

window.onload=function(){
	alert("제발 등록되어랏!!")
	$.ajax({
		url : "./load.do",
		type : "post",
		dataType : "json",
		data : {
			"seq" : "seq"//이게 어떤 사업장의 스케쥴인지 불러올 수 있는 변수가 되면 딱 될거같은 늭김
		},
		success : function(msg) {

			$.each(msg,function(key,value){
//				if(key=='schedule'){
//					
//				}
//				alert(value.start);
				$.each(value,function(k,v){
				    calendar.createSchedules([
				         {
				           id: v.id,
				           calendarId: v.calendarId,
				           title: v.title,
				           category: v.category,
				           start: v.start,
				           end: v.end,
				           color: v.color,
				           bgColor: v.bgColor,
				           dragBgColor: v.dragBgColor,
				           borderColor: v.borderColor
				         }]);
					
				});

			});

		},
		error : function() {
			alert("잘못된 요청입니다.");
		}
	});
}
  calendar.on('beforeCreateSchedule', scheduleData => {
         const schedule = {
           calendarId: 'SONG',
           id: String(Math.random() * 100000000000000000),
           title: scheduleData.title,
           isAllDay: scheduleData.isAllDay,
           start: scheduleData.start,
           end: scheduleData.end,
           category: scheduleData.isAllDay ? 'allday' : 'time'
         };
         
         
         calendar.createSchedules([schedule]);
         console.log('beforeCreateSchedule', [schedule]);
         alert(schedule.calendarId);
         alert(schedule.id);
         alert(schedule.title);
         alert(schedule.isAllDay);
         alert(schedule.start);
         alert(schedule.end);
         alert(schedule.category);
         alert('일정 생성 완료'+typeof [schedule]);
         
//         캘린더의 빈 공간에 마우스를 클릭하거나 드래깅하면 새 일정을 작성할 수 있는 팝업이 나타납니다.
//         팝업의 항목을 입력 후 저장을 하면 beforeCreateSchedule 이벤트가 발생하고 
//         콜백함수 내에서 createSchedules() 를 사용하여 일정을 저장할 수 있습니다. 
//         이벤트 훅이므로 필요한 경우 서버에 일정을 저장하고 호출하는 식으로 동작하면 되겠습니다.


         
   });
//  'beforeCreateSchedule': function(e) {
//  console.log('beforeCreateSchedule', e);
//  saveNewSchedule(e);
//},
    //콜백함수  내에서 createSchedules()를 사용하여 일정을 저장할 수 잇습니다. 
    //이벤트 훅 이므로 필요한 경우 서버에 일정을 저장하고 호출하는 식으로 동작하면 되겠습니다.
    calendar.on('beforeUpdateSchedule', scheduleData => {
         const {schedule} = scheduleData;
         calendar.updateSchedule(schedule.id, schedule.calendarId, schedule);
         alert('일정 편집 완료');
       });
//  'beforeUpdateSchedule': function(e) {
//  var schedule = e.schedule;
//  var changes = e.changes;
//
//  console.log('beforeUpdateSchedule', e);
//
//  if (changes && !changes.isAllDay && schedule.category === 'allday') {
//      changes.category = 'time';
//  }
//
//  cal.updateSchedule(schedule.id, schedule.calendarId, changes);
//  refreshScheduleVisibility();
//},
    calendar.on('beforeDeleteSchedule', scheduleData => {
         const {schedule, start, end} = scheduleData;

         schedule.start = start;
         schedule.end = end;
         calendar.deleteSchedule(schedule.id, schedule.calendarId);
         alert('일정 삭제 완료');
       });
    
//    var silent = true;////////////////////////////////////ㄴㄴ
//    calendar.clear();
//    calendar.createSchedules(schedules, silent);
//    calendar.render();
    // Render a calendar when resizing a window.
    window.addEventListener('resize', function() {
        calendar.render();
    });
    


