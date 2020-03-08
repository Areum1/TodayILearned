// Class
export default class CodeSquad {
    constructor(props){
        this.lectures = ['java','ios'];
    }
    getLectures(){
        return this.lectures;
    }

    getCurrentHour = () => {
        return (new Date).getHours();
    }

    getTime(){
        return Date.now();
    }
}